package com.hy.enums;

public enum APP_ORDER_STATUS_ENUMS {

	// 状态：0：初始；1：支付成功；2：支付失败；
	INIT_0(0, "初始"),
	/**
	 * 1：支付成功；
	 */
	success_1(1, "支付成功"),
	/**
	 * 2：支付失败；
	 */
	failure_2(2, "支付失败"), ;
	public final int code;
	public final String msg;

	APP_ORDER_STATUS_ENUMS(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
