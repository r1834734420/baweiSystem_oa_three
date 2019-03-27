package com.bawei.controller;

import com.bawei.pojo.Attendance;
import com.bawei.pojo.UserInfo;
import com.bawei.service.AttendanceService;
import com.bawei.utils.OAResult;
import com.bawei.utils.PageView;
import com.bawei.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    /**
     * 考勤记录列表
     * @param currentPage
     * @param signOutStr
     * @return
     */
    @RequestMapping("/attendance/attend/list")
                                //给这个当前页定义个初始值为1
    public String attendanceList(@RequestParam(defaultValue = "1")String currentPage, String signInStr, String signOutStr, HttpSession session,HttpServletRequest request){
        PageView<Attendance> pageView = new PageView<Attendance>();
        pageView.setCurrentPage(Integer.valueOf(currentPage));  //查询当前页
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        pageView = attendanceService.attendanceList(userInfo.getId(),signInStr,signOutStr,pageView);
        request.setAttribute("pageView",pageView);

        request.setAttribute("signInStr",signInStr);

        request.setAttribute("signOutStr",signOutStr);

        //验证当前用户是否签到
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");  //获取当前时间 获取当前时间根据当前实时更新
        String formatDate = simpleDateFormat.format(date);  //转换成date日期格式

        Attendance attendance = this.checKLogin(userInfo.getId(),formatDate);  //获取当前签到的日期
        if(attendance!=null){
            //根据签到日期查询
            request.setAttribute("isSignIn",1);  //代表已签到
        }else{
            request.setAttribute("isSignIn",0);  //代表未签到
        }

        return "forward:/system/attendance.jsp";
    }

    private Attendance checKLogin(String id, String formatDate) {
        //根据获取的用户id去查询当前是否签到
        Attendance attendance = attendanceService.checkLoginIn(id,formatDate);
        return attendance;
    }

    /**
     * 用户签到
     * @param request
     * @param response
     * @return
     * @throws ParseException
     */
    @RequestMapping("/attendance/attend/signIn")
    @ResponseBody
    public OAResult attendSignIn(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user"); //获取登录的用户
        String id= StringUtil.uuid();  //签到表的id
        String ipAddr = StringUtil.getIpAddr(request);  //获取本机的ip
        int i = attendanceService.addSignIn(userInfo.getId(),id,ipAddr);

        if(i>0){
            return new OAResult("200","签到成功");
        }else{
            return new OAResult("400","签到失败");
        }

    }

    @RequestMapping("/attendance/attend/signOut")
    @ResponseBody
    public OAResult attendSignOut(HttpServletRequest request,HttpServletResponse response) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = simpleDateFormat.format(date);
        Date formatDateTime = simpleDateFormat.parse(formatDate);
        UserInfo user = (UserInfo) request.getSession().getAttribute("user");

        Attendance attendance = this.checKLogin(user.getId(), formatDate);
        int i = attendanceService.attendSignOut(attendance);
    //    OAResult oaResult = new OAResult();
        if(i>0){
          return new OAResult("200","签退成功");
        }else{
            return new OAResult("400","签退失败");
        }
    }




}
