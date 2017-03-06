package com.hy.model;


public class AppProtocolModel extends PageQueryDTO{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String appCode;
    private String appName;

    private String md5Key;

    private String status;

    private String ipAddress;

    private String createTime;

    private String upDateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getMd5Key() {
        return md5Key;
    }

    public void setMd5Key(String md5Key) {
        this.md5Key = md5Key;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpDateTime() {
        return upDateTime;
    }

    public void setUpStringTime(String upDateTime) {
        this.upDateTime = upDateTime;
    }

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setUpDateTime(String upDateTime) {
		this.upDateTime = upDateTime;
	}
}