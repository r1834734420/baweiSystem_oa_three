package com.bawei.pojo;

import java.util.Date;

public class Attendance {
    private String id;

    private String userId;

    private Date signIn;

    private Date signOut;

    private String ip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getSignIn() {
        return signIn;
    }

    public void setSignIn(Date signIn) {
        this.signIn = signIn;
    }

    public Date getSignOut() {
        return signOut;
    }

    public void setSignOut(Date signOut) {
        this.signOut = signOut;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}