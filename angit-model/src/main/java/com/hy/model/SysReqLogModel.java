package com.hy.model;


public class SysReqLogModel {
    /**
	 * 
	 */
	private String id;

    private Integer status;

    private String sysId;

    private String logNo;

    private String charset;

    private String requestTime;

    private String requestContent;

    private String responseContent;

    private String requestCnt;

    private String createTime;

    private String upDateTime;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getLogNo() {
        return logNo;
    }

    public void setLogNo(String logNo) {
        this.logNo = logNo;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestCnt() {
		return requestCnt;
	}

	public void setRequestCnt(String requestCnt) {
		this.requestCnt = requestCnt;
	}

	public String getUpDateTime() {
		return upDateTime;
	}

	public void setUpDateTime(String upDateTime) {
		this.upDateTime = upDateTime;
	}

}