package com.bawei.pojo;

public class RoleMenuAuthority {
    private Integer id;

    private String roleId;

    private Integer menuAuthId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public Integer getMenuAuthId() {
        return menuAuthId;
    }

    public void setMenuAuthId(Integer menuAuthId) {
        this.menuAuthId = menuAuthId;
    }
}