package com.bawei.pojo;

import java.util.Date;

public class Accessory {
    private String id;

    private String tId;

    private String accUrl;

    private Date uploadTime;

    private String formerly;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String getAccUrl() {
        return accUrl;
    }

    public void setAccUrl(String accUrl) {
        this.accUrl = accUrl == null ? null : accUrl.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getFormerly() {
        return formerly;
    }

    public void setFormerly(String formerly) {
        this.formerly = formerly == null ? null : formerly.trim();
    }
}