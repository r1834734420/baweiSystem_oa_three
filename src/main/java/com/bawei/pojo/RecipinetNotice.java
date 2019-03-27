package com.bawei.pojo;

public class RecipinetNotice {
    private Integer id;

    private String recipinetId;

    private String noticeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecipinetId() {
        return recipinetId;
    }

    public void setRecipinetId(String recipinetId) {
        this.recipinetId = recipinetId == null ? null : recipinetId.trim();
    }

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId == null ? null : noticeId.trim();
    }
}