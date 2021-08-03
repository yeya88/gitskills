package com.jd.discovery.channel.dal.client.service;

import com.jd.discovery.channel.dal.client.domain.QueryTagReceiveJinDouLogIn;
import com.jd.discovery.channel.dal.client.domain.RecommendLookTagReceiveJinDouLog;

import java.util.List;

/**
 * @ClassName RecommendLookTagReceiveJinDouLogDaoService
 * @Description 兴趣标签发豆流水操作服务
 * @Author ZhouYouMing
 * @Date 2020/10/15 19:44
 */
public interface RecommendLookTagReceiveJinDouLogDaoService  {

    /**
     *@Description 写入发豆流水
     *@Param [jinDouLog]
     *@Return boolean
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:18
     */
    public boolean insertRecommendLookTagReceiveJinDouLog(RecommendLookTagReceiveJinDouLog jinDouLog);

    /**
     *@Description 分页获取发豆流水记录
     *@Param [pageIn]
     *@Return java.util.List<com.jd.discovery.channel.dal.client.domain.RecommendLookTagReceiveJinDouLog>
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:19
     */
    public List<RecommendLookTagReceiveJinDouLog> getRecommendLookTagReceiveJinDouLogPageList(QueryTagReceiveJinDouLogIn pageIn);

    /**
     *@Description 获取总共发豆流水记录总条数
     *@Param [pageIn]
     *@Return java.lang.Integer
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:20
     */
    public Integer getRecommendLookTagReceiveJinDouLogPageTotal(QueryTagReceiveJinDouLogIn pageIn);

    /**
     *@Description 更新京豆流水记录
     *@Param [jinDouLog]
     *@Return java.lang.Integer
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:20
     */
    public Integer updateRecommendLookTagReceiveJinDouLog(RecommendLookTagReceiveJinDouLog jinDouLog);
}
