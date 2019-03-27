package com.bawei.service;

import com.bawei.mapper.AttendanceMapper;
import com.bawei.pojo.Attendance;
import com.bawei.utils.PageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.ch.SelectorImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceMapper attendanceMapper;


    Attendance attendance = new Attendance();
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    String formatDate = simpleDateFormat.format(date);
    Date formateDateTime;

    {
        try {
            formateDateTime = simpleDateFormat.parse(formatDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    /**
     * 考勤记录
     *
     * @param id
     * @param signInStr
     * @param signOutStr
     * @param pageView
     * @return
     */
    public PageView<Attendance> attendanceList(String id, String signInStr, String signOutStr, PageView<Attendance> pageView) {
        List<Attendance> list = attendanceMapper.attendanceLists(id,signInStr,signOutStr);
        pageView.setRecords(list);  //记录列表
        pageView.setTotalRecord((long)list.size());  //总记录数
        return pageView;
    }

    /**
     * 查询用户是否签到
     * @param id
     * @param formatDate
     * @return
     */
    public Attendance checkLoginIn(String id, String formatDate) {
        Attendance attendance = attendanceMapper.checkLoginIn(id,formatDate);
        return attendance;
    }

    /**
     * 签到
     * @param id
     * @param userId
     * @param ipAddr
     * @return
     */
    public int addSignIn(String userId, String id, String ipAddr) throws ParseException {

        attendance.setId(id);
        attendance.setUserId(userId);
        attendance.setIp(ipAddr);
        attendance.setSignIn(formateDateTime);
        int i = attendanceMapper.insert(attendance);
        return i;
    }

    /**
     * 签退
     * @param attendance
     * @return
     */
    public int attendSignOut(Attendance attendance) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = simpleDateFormat.format(new Date());
        Date parseDate = simpleDateFormat.parse(formatDate);
        attendance.setSignOut(parseDate);
        int i = attendanceMapper.updateByPrimaryKey(attendance);
        return i;
    }


}
