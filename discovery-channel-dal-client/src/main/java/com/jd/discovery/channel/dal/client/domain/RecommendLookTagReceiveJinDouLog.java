package com.jd.discovery.channel.dal.client.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName RecommendLookTagReceiveJinDouLog
 * @Description 描述这个类作用
 * @Author ZhouYouMing
 * @Date 2020/10/15 19:45
 */
@Data
public class RecommendLookTagReceiveJinDouLog implements Serializable {

    private static final long serialVersionUID = 6417286557196176179L;

    //主键
    private Long id;
    //流水号
    private String sn;
    //pin
    private String pin;
    //发送数量
    private Integer amoun;
    //京豆发送状态：1-成功  2-失败
    private Integer sendState;
    //接口返回状态码
    private String resultCode;
    //接口返回信息描述
    private String resultMsg;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //备注
    private String remark;
    //预留扩展字段
    private String extend;
    //发豆的核心京豆信息
    private String jinDouConfig;
    //是否业务处理异常:0-无异常 1-异常
    private Integer bizExceptionState;
    //是否风控用户: 0-不是  1-是
    private Integer riskState;
}
