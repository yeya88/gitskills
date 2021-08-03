package com.jd.discovery.channel.dal.service.impl;

import com.jd.discovery.channel.dal.client.domain.QueryTagReceiveJinDouLogIn;
import com.jd.discovery.channel.dal.client.domain.RecommendLookTagReceiveJinDouLog;
import com.jd.discovery.channel.dal.client.service.RecommendLookTagReceiveJinDouLogDaoService;
import com.jd.discovery.channel.dal.dao.jindou.RecommendLookTagReceiveJinDouLogMapper;
import com.jd.ump.profiler.CallerInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RecommendLookTagReceiveJinDouLogDaoServiceImpl
 * @Description 描述这个类作用
 * @Author ZhouYouMing
 * @Date 2020/10/15 19:51
 */
@Service("recommendLookTagReceiveJinDouLogDaoServiceImpl")
@Slf4j
public class RecommendLookTagReceiveJinDouLogDaoServiceImpl implements RecommendLookTagReceiveJinDouLogDaoService {

    @Autowired
    private RecommendLookTagReceiveJinDouLogMapper recommendLookTagReceiveJinDouLogMapper;

    /**
     *@Description 写入发豆流水
     *@Param [jinDouLog]
     *@Return boolean
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:18
     */
    @Override
    public boolean insertRecommendLookTagReceiveJinDouLog(RecommendLookTagReceiveJinDouLog jinDouLog) {
        return recommendLookTagReceiveJinDouLogMapper.insertRecommendLookTagReceiveJinDouLog(jinDouLog);
    }

    /**
     *@Description 分页获取发豆流水记录
     *@Param [pageIn]
     *@Return java.util.List<com.jd.discovery.channel.dal.client.domain.RecommendLookTagReceiveJinDouLog>
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:19
     */
    @Override
    public List<RecommendLookTagReceiveJinDouLog> getRecommendLookTagReceiveJinDouLogPageList(QueryTagReceiveJinDouLogIn pageIn){
        return recommendLookTagReceiveJinDouLogMapper.getRecommendLookTagReceiveJinDouLogPageList(pageIn);
    }

    /**
     *@Description 更新京豆流水记录
     *@Param [jinDouLog]
     *@Return java.lang.Integer
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:20
     */
    @Override
    public Integer updateRecommendLookTagReceiveJinDouLog(RecommendLookTagReceiveJinDouLog jinDouLog){
        return recommendLookTagReceiveJinDouLogMapper.updateRecommendLookTagReceiveJinDouLog(jinDouLog);
    }

    /**
     *@Description 获取总共发豆流水记录总条数
     *@Param [pageIn]
     *@Return java.lang.Integer
     *@Author ZhouYouMing
     *@Date 2020/10/15
     *@Time 15:20
     */
    @Override
    public Integer getRecommendLookTagReceiveJinDouLogPageTotal(QueryTagReceiveJinDouLogIn pageIn){
        return recommendLookTagReceiveJinDouLogMapper.getRecommendLookTagReceiveJinDouLogPageTotal(pageIn);
    }

}
