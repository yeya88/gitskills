package com.jd.discovery.channel.dal.common.result;


import com.jd.discovery.channel.dal.common.enums.SysCodeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * soa返回结果
 * 
 * @author wangxing
 *
 */
public class Result {

	/**
	 * 返回code,为了支持gw，一直为0
	 */
	private String code = SysCodeEnum.Success.getCode();

	/**
	 * 是否成功标识,客户端判断是否调用成功的标识
	 */
	private Boolean success;

	/**
	 * 返回业务码
	 */
	private String busiCode;

	/**
	 * 返回的业务信息
	 */
	private String message;

	/**
	 * 返回内容
	 */
	private Map<String, Object> result = new HashMap<String, Object>();

	public Result(boolean isSuccess) {
		if (isSuccess) {
			this.success = true;
			this.busiCode = SysCodeEnum.Success.getCode();
			this.message = SysCodeEnum.Success.getMsg();
		} else {
			this.success = false;
			this.busiCode = SysCodeEnum.BusinessError.getCode();
			this.message = SysCodeEnum.BusinessError.getMsg();
		}
	}

	public Result(boolean isSuccess, SysCodeEnum code) {
		if (isSuccess) {
			this.success = true;
			this.busiCode = code.getCode();
			this.message = code.getMsg();
		} else {
			this.success = false;
			this.busiCode = code.getCode();
			this.message = code.getMsg();
		}
	}

	/**
	 * 创建成功的result
	 * 
	 * @return
	 */
	public static Result buildSuccess() {
		return new Result(true);
	}

	/**
	 * static
	 * 
	 * @param code 成功的枚举code
	 * @return
	 */
	public static Result buildSuccess(SysCodeEnum code) {
		return new Result(true, code);
	}

	/**
	 * 创建失败的result
	 * 
	 * @return
	 */
	public static Result buildFailure() {
		return new Result(false);
	}

	/**
	 * 创建失败的result
	 * 
	 * @param code 失败的枚举code
	 * @return
	 */
	public static Result buildFailure(SysCodeEnum code) {
		return new Result(false, code);
	}

	/**
	 * 返回自身，支持链式编程
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public Result add(String key, Object value) {
		result.put(key, value);
		return this;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public String getCode() {
		return code;
	}

	public Boolean getSuccess() {
		return success;
	}

	public String getBusiCode() {
		return busiCode;
	}

	public String getMessage() {
		return message;
	}

}
