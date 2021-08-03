package com.jd.discovery.channel.dal.controller;

import javax.servlet.http.HttpServletRequest;

import com.jd.discovery.channel.dal.common.enums.SysCodeEnum;
import com.jd.discovery.channel.dal.common.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.m.njf.common.util.JsonUtil;

/**
 * 不要删除！！！用于处理系统异常<br>
 * 异常处理控制器，用来处理一些异常和防止没有注册的接口请求是，响应异常的问题<br>
 * methodNotExist:对没找到的方法返回方法未找到的错误码
 * 
 * @author wangxing@jd.com
 *
 */
@Controller
@RequestMapping("/")
public class ExceptionController {

	private static Logger logger = LoggerFactory.getLogger(ExceptionController.class);

	@RequestMapping(value = "/null")
	public @ResponseBody Result nullPointerException(HttpServletRequest request, Exception exception) throws Exception {

		logger.error("nullPointerException.uri: " + request.getRequestURI(), exception);
		logger.error("nullPointerException.parameter" + JsonUtil.write2JsonStr(request.getParameterMap()));

		if (exception instanceof NullPointerException) {
			return new Result(false, SysCodeEnum.BusinessError);
		}
		return new Result(false, SysCodeEnum.SysError);
	}

	@RequestMapping(value = "/exception")
	public @ResponseBody Result exception(HttpServletRequest request, Exception exception) throws Exception {
		logger.error("exception.uri: " + request.getRequestURI(), exception);
		logger.error("exception.parameter" + JsonUtil.write2JsonStr(request.getParameterMap()));

		Result result = new Result(false, SysCodeEnum.SysError);
		return result;
	}

	@RequestMapping(value = "/limitexception")
	public @ResponseBody Result limitException(HttpServletRequest request, Exception exception) throws Exception {
		logger.error("exception.uri: " + request.getRequestURI(), exception);
		logger.error("exception.parameter" + JsonUtil.write2JsonStr(request.getParameterMap()));

		Result result = new Result(false, SysCodeEnum.LimitError);
		return result;
	}

	@RequestMapping(value = "/businessexception")
	public @ResponseBody Result businessException(HttpServletRequest request, Exception exception) throws Exception {
		logger.error("exception.uri: " + request.getRequestURI(), exception);
		logger.error("exception.parameter" + JsonUtil.write2JsonStr(request.getParameterMap()));

		Result result = new Result(false, SysCodeEnum.BusinessError);
		return result;
	}

	@RequestMapping(value = "/**")
	public @ResponseBody Result methodNotExist(HttpServletRequest request) throws Exception {

		logger.error("methodNotExist.uri: " + JsonUtil.write2JsonStr(request.getRequestURI()));
		logger.error("methodNotExist.parameter" + JsonUtil.write2JsonStr(request.getParameterMap()));

		return new Result(false, SysCodeEnum.MethodNotExist);
	}

}
