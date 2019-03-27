package com.bawei.service;

import com.bawei.pojo.Menu;
import com.bawei.utils.OAResult;

import java.util.List;

public interface ILoginService {

    OAResult checkLogin(String account, String password);

    List<Menu> menuList(String parentId);
}
