package com.hy.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AppOrdersDto {
    private Integer id;

    private Integer appId;

    private String appMerchantNo;

    private String appMerchantName;

    private String appOrderNo;

    private BigDecimal amount;

    private Integer status;

    private String notifyUrl;

    private String codeUrl;

    private String extension;

    private Date createTime;

    private Date upateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppMerchantNo() {
        return appMerchantNo;
    }

    public void setAppMerchantNo(String appMerchantNo) {
        this.appMerchantNo = appMerchantNo;
    }

    public String getAppMerchantName() {
        return appMerchantName;
    }

    public void setAppMerchantName(String appMerchantName) {
        this.appMerchantName = appMerchantName;
    }

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpateTime() {
        return upateTime;
    }

    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }
}