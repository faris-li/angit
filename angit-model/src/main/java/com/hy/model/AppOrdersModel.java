package com.hy.model;


public class AppOrdersModel  extends PageQueryDTO{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String appId;

    private String appMerchantNo;

    private String appMerchantName;

    private String appOrderNo;

    private String amount;

    private String status;

    private String notifyUrl;

    private String codeUrl;

    private String extension;

    private String createTime;

    private String upateTime;
    //渠道名称
    private String appName;
    //开始时间
    private String startTime;
    //结束时间
    private  String endTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpateTime() {
        return upateTime;
    }

    public void setUpateTime(String upateTime) {
        this.upateTime = upateTime;
    }

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
    
}