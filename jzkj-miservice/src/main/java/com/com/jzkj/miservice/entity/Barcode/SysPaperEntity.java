package com.com.jzkj.miservice.entity.Barcode;

import java.util.Date;

public class SysPaperEntity {
    private Integer id;

    private String name;

    private String telphone;

    private String createPeople;

    private String qq;

    private Date createTime;

    private Date updateTimr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople == null ? null : createPeople.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTimr() {
        return updateTimr;
    }

    public void setUpdateTimr(Date updateTimr) {
        this.updateTimr = updateTimr;
    }
}