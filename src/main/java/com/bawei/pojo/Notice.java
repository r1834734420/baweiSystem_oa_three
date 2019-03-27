package com.bawei.pojo;

import java.util.Date;

public class Notice {
    private String id;

    private String userId;

    private String title;

    private String content;

    private Integer isAccessory;

    private Date takeEffectTime;

    private Date loseEffectyTime;

    private Date examineTime;

    private String examineUser;

    private Date publishTime;

    private Integer status;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIsAccessory() {
        return isAccessory;
    }

    public void setIsAccessory(Integer isAccessory) {
        this.isAccessory = isAccessory;
    }

    public Date getTakeEffectTime() {
        return takeEffectTime;
    }

    public void setTakeEffectTime(Date takeEffectTime) {
        this.takeEffectTime = takeEffectTime;
    }

    public Date getLoseEffectyTime() {
        return loseEffectyTime;
    }

    public void setLoseEffectyTime(Date loseEffectyTime) {
        this.loseEffectyTime = loseEffectyTime;
    }

    public Date getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(Date examineTime) {
        this.examineTime = examineTime;
    }

    public String getExamineUser() {
        return examineUser;
    }

    public void setExamineUser(String examineUser) {
        this.examineUser = examineUser == null ? null : examineUser.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}