package com.hy.model;

import java.net.URLEncoder;

public class OrderRequestBean extends BaseRequestBean {

	private String channel_no;
	private String trade_no;
	private String merchant_id;
	private String merchant_name;
	private String trade_amount;
	private String notify_url;
	private String code_url;
	private String extension;

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

	public String getMerchant_name() {
		return merchant_name;
	}

	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}

	public String getTrade_amount() {
		return trade_amount;
	}

	public void setTrade_amount(String trade_amount) {
		this.trade_amount = trade_amount;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getCode_url() {
		return code_url;
	}

	public void setCode_url(String code_url) {
		this.code_url = code_url;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	// channel_name + | +trade_no + | + merchant_id + | +
	// URL_Encode(merchant_name) + | + trade_amount + | + URL_Encode(notify_url)
	// + | + URL_Encode(code_url) + | + _input_charset + | + version + | +
	// sign_type + URL_Encode(extension)

	public String sign(String md5Key) throws Exception {
		StringBuffer buffer = new StringBuffer();
		buildSign(getChannel_no(), buffer);
		buildSign(this.trade_no, buffer);
		buildSign(URLEncoder.encode(merchant_name, this.get_input_charset()), buffer);
		buildSign(this.trade_amount, buffer);
		buildSign(URLEncoder.encode(notify_url, this.get_input_charset()), buffer);
		buildSign(URLEncoder.encode(this.code_url, this.get_input_charset()), buffer);
		buildSign(get_input_charset(), buffer);
		buildSign(getVersion(), buffer);
		buildSign(getSign_type(), buffer);
		if (isBlank(getExtension())) buffer.append(getExtension());

		return getMD5(buffer.append(md5Key).toString());
	}

}
