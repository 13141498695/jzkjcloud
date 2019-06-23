package com.com.jzkj.miservice.entity.Barcode;

import java.util.Date;

public class SysBarcode {
    private Integer id;

    private Integer needCount;

    private Date createTime;

    private Integer intCount;

    private Integer barcodeStatus;

    private Integer scCount;

    private Date operationTime;

    private String sqRemarks;

    private String createPeople;

    private String operatePeople;

    private String clRemark;

    private String productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNeedCount() {
        return needCount;
    }

    public void setNeedCount(Integer needCount) {
        this.needCount = needCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIntCount() {
        return intCount;
    }

    public void setIntCount(Integer intCount) {
        this.intCount = intCount;
    }

    public Integer getBarcodeStatus() {
        return barcodeStatus;
    }

    public void setBarcodeStatus(Integer barcodeStatus) {
        this.barcodeStatus = barcodeStatus;
    }

    public Integer getScCount() {
        return scCount;
    }

    public void setScCount(Integer scCount) {
        this.scCount = scCount;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getSqRemarks() {
        return sqRemarks;
    }

    public void setSqRemarks(String sqRemarks) {
        this.sqRemarks = sqRemarks == null ? null : sqRemarks.trim();
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople == null ? null : createPeople.trim();
    }

    public String getOperatePeople() {
        return operatePeople;
    }

    public void setOperatePeople(String operatePeople) {
        this.operatePeople = operatePeople == null ? null : operatePeople.trim();
    }

    public String getClRemark() {
        return clRemark;
    }

    public void setClRemark(String clRemark) {
        this.clRemark = clRemark == null ? null : clRemark.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }
}