package com.jd.discovery.channel.dal.common.enums;

public enum SysCodeEnum {
	Success("0", "成功"),

	/**
	 * 参数错误
	 */
	ParamError("1", "参数错误"),

	/**
	 * 方法不存在
	 */
	MethodNotExist("2", "方法不存在"),

	/**
	 * 用户未登录
	 */
	NotLogin("3", "用户未登录"),

	/**
	 * 业务异常
	 */
	BusinessError("-99", "系统异常"),

	/**
	 * 系统异常
	 */
	SysError("-1", "系统异常"),

	/**
	 * 限流降级
	 */
	LimitError("-2", "限流降级"),

	/**
	 * 接口调用异常
	 */
	InterfaceError("900", "上游接口调用异常");

	private String code;

	private String msg;

	public String getCode() {
		return code;
	}

	private SysCodeEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
