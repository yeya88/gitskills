package com.jd.discovery.channel.dal.controller;

import javax.servlet.http.HttpServletRequest;

import com.jd.discovery.channel.dal.common.enums.SysCodeEnum;
import com.jd.discovery.channel.dal.common.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 系统默认控制器，提供一些查询系统状态的方法,建议在ump监控中增加此方法
 * 
 * @author wangxing@jd.com
 *
 */
@Controller
@RequestMapping("/")
public class SystemController {

	private static Logger logger = LoggerFactory.getLogger(SystemController.class);

	@RequestMapping(value = "/monitor")
	public @ResponseBody
	Result monitor(HttpServletRequest request, Exception exception)
			throws Exception {
		return new Result(true, SysCodeEnum.Success).add("properties", System.getProperties());
	}

}
