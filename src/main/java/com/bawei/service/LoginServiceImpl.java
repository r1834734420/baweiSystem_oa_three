package com.bawei.service;

import com.bawei.mapper.MenuMapper;
import com.bawei.mapper.UserInfoMapper;
import com.bawei.pojo.Menu;
import com.bawei.pojo.MenuExample;
import com.bawei.pojo.UserInfo;
import com.bawei.pojo.UserInfoExample;
import com.bawei.utils.MD5Utils;
import com.bawei.utils.OAResult;
import org.owasp.esapi.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements  ILoginService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    public OAResult checkLogin(String account, String password) {

        //判断用户是否输入用户名或密码
        if(account == null || password == null || "".equals(account) || "".equals(password)){
            return new OAResult("400","请输入用户名或密码");
        }

        //验证用户名
        UserInfo userInfo = login(account);
        if(account == null){
            return new OAResult("400","用户名有误");
        }
        //验证密码
        if(!userInfo.getPassword().equals(MD5Utils.md5(password))){
            return new OAResult("400","密码错误");
        }

        //验证通过返回userInfo
        return new OAResult("200",userInfo);
    }

    private UserInfo login(String account) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria(); //创建查询条件
        criteria.andAccountEqualTo(account); //封装查询条件
        List<UserInfo> userInfo = userInfoMapper.selectByExample(example);  //根据这个查询条件去查询数据库
        if(userInfo.size() == 0){
            return null;
        }
        return userInfo.get(0);  //返回这个唯一的用户名
    }

    /**
     * 查询菜单
     * @param parentId
     * @return
     */
    public List<Menu> menuList(String parentId) {

        MenuExample example = new MenuExample();
        MenuExample.Criteria criteria = example.createCriteria();  //创建查询条件
        criteria.andParentIdEqualTo(parentId);  //封装菜单的parentId

        List<Menu> list = menuMapper.selectByExample(example); //根据封装的这个parentId去查询列表

        for (Menu menu : list){ //遍历这个根据parentId查到的列表
            List<Menu> menus = menuList(menu.getId()); // 把这个列表的id遍历出来
            menu.setMenuList(menus); //把遍历出来的id set到这个列表里
        }

        return list;
    }

}
