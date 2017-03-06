package com.hy.dto;

import java.util.Date;

public class SysReqLogDto {
    private Integer id;

    private String reqLogType;

    private Integer status;

    private String sysAppId;

    private String bizNo;

    private String charset;

    private Date requestTime;

    private String requestContent;

    private String responseContent;

    private Integer requestCnt;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReqLogType() {
        return reqLogType;
    }

    public void setReqLogType(String reqLogType) {
        this.reqLogType = reqLogType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSysAppId() {
        return sysAppId;
    }

    public void setSysAppId(String sysAppId) {
        this.sysAppId = sysAppId;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }

    public Integer getRequestCnt() {
        return requestCnt;
    }

    public void setRequestCnt(Integer requestCnt) {
        this.requestCnt = requestCnt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}