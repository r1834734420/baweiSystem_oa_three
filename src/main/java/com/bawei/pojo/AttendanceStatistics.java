package com.bawei.pojo;

import java.util.Date;

public class AttendanceStatistics {
    private String id;

    private String userId;

    private String date;

    private Date createTime;

    private Integer late;

    private Integer leaveEarly;

    private Integer overTime;

    private Integer leaveTime;

    private Integer shouldTime;

    private Integer realTime;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getLeaveEarly() {
        return leaveEarly;
    }

    public void setLeaveEarly(Integer leaveEarly) {
        this.leaveEarly = leaveEarly;
    }

    public Integer getOverTime() {
        return overTime;
    }

    public void setOverTime(Integer overTime) {
        this.overTime = overTime;
    }

    public Integer getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Integer leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getShouldTime() {
        return shouldTime;
    }

    public void setShouldTime(Integer shouldTime) {
        this.shouldTime = shouldTime;
    }

    public Integer getRealTime() {
        return realTime;
    }

    public void setRealTime(Integer realTime) {
        this.realTime = realTime;
    }
}