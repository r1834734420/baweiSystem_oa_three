package com.bawei.utils;

import com.bawei.pojo.UserInfo;

public class OAResult {

	private String message;
	private String code;
	private UserInfo userInfo;
	private String startTime;
	private  String endTime;
	private String des;
	private String id;
	private String oldpwd;
	private String newpwd;
	private String path;
	
	
	public OAResult(){}
	public OAResult(String code) {
		this.code = code;
	}
	public OAResult(String id,String startTime, String endTime,String des) {
		this.id=id;
		this.startTime=startTime;
		this.endTime=endTime;
		this.des=des;
	}
	
	public OAResult(String code,UserInfo userInfo) {
		this.code = code;
		this.userInfo = userInfo;
	}
	
	public OAResult(String code,String message) {
		this.message = message;
		this.code = code;
	}

    public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getOldpwd() {
		return oldpwd;
	}
	public void setOldpwd(String oldpwd) {
		this.oldpwd = oldpwd;
	}
	public String getNewpwd() {
		return newpwd;
	}
	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
