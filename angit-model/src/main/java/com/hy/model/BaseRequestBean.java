package com.hy.model;
import java.math.BigInteger;
import java.security.MessageDigest;

public class BaseRequestBean {

	protected final String separator = "|";
	protected final String MD = "MD5";

	private String notify_time;
	private String _input_charset;
	private String sign;
	private String sign_type;
	private String version;
	private String channel_no;

	protected void buildSign(String val, StringBuffer buffer) {
		if (isBlank(val)) buffer.append(val).append(separator);
	}

	protected boolean isBlank(String val) {
		// StringUtils.
		return true;
	}

	/**
	 * 对字符串md5加密
	 *
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public String getMD5(String str) throws Exception {
		// 生成一个MD5加密计算摘要
		MessageDigest md = MessageDigest.getInstance(MD);
		// 计算md5函数
		md.update(str.getBytes());
		// digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
		// BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
		return new BigInteger(1, md.digest()).toString(16);
	}

	public String getChannel_no() {
		return channel_no;
	}

	public void setChannel_no(String channel_no) {
		this.channel_no = channel_no;
	}

	public String getNotify_time() {
		return notify_time;
	}

	public void setNotify_time(String notify_time) {
		this.notify_time = notify_time;
	}

	public String get_input_charset() {
		return _input_charset;
	}

	public void set_input_charset(String _input_charset) {
		this._input_charset = _input_charset;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
