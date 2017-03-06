package com.hy.model;
public class AsyncNotifyBean extends BaseRequestBean {

	private String channel_no;
	private String trade_no;
	private String merchant_id;
	private String status;

	public String getChannel_no() {
		return channel_no;
	}

	public void setChannel_no(String channel_no) {
		this.channel_no = channel_no;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public String getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// channel_no + | + trade_no + | + merchant_id + | + status + | +
	// _input_charset + | + version + | + sign_type

	public String sign(String md5Key) throws Exception {
		StringBuffer buffer = new StringBuffer();
		buildSign(this.channel_no, buffer);
		buildSign(this.trade_no, buffer);
		buildSign(this.merchant_id, buffer);
		buildSign(this.status, buffer);
		buildSign(get_input_charset(), buffer);
		buildSign(getVersion(), buffer);
		buildSign(getSign_type(), buffer);
		// TODO:md5key 2 MD5
		return getMD5(buffer.append(md5Key).toString());
	}

}
