package com.bawei.controller;

import com.bawei.pojo.Menu;
import com.bawei.pojo.UserInfo;
import com.bawei.service.ILoginService;
import com.bawei.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    protected ILoginService loginService;


    /**
     * 登录
     * @param account
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/login/checkLogin")
    @ResponseBody
    public OAResult login(String account, String password, HttpSession session, HttpServletRequest request){
       try {
           OAResult oaResult = this.loginService.checkLogin(account,password);
           if(oaResult != null){
               request.getSession().setAttribute("user",oaResult.getUserInfo());
           }
           return oaResult;
       }catch (Exception e){
           return null;
       }
    }

    /**
     * 查询菜单
     * @param parentId
     * @return
     */
    @RequestMapping("/login/menu")
    @ResponseBody
    public List<Menu> menuList(@RequestParam(defaultValue = "0")String parentId){
      List<Menu> menuList = loginService.menuList(parentId);  //根据这个parentId查询到数据的集合
      return menuList;
    }
}
