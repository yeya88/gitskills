package com.jd.discovery.channel.dal.dao.jindou;

import com.jd.discovery.channel.dal.client.domain.QueryTagReceiveJinDouLogIn;
import com.jd.discovery.channel.dal.client.domain.RecommendLookTagReceiveJinDouLog;
import com.jd.njf.soa.commons.lang.annotation.DataSource;

import java.util.List;

/**
 * @author xinlei
 * @create 2020-04-22 20:14
 */
public interface RecommendLookTagReceiveJinDouLogMapper {

    @DataSource("master")
    public boolean insertRecommendLookTagReceiveJinDouLog(RecommendLookTagReceiveJinDouLog jinDouLog);

    @DataSource("master")
    public List<RecommendLookTagReceiveJinDouLog> getRecommendLookTagReceiveJinDouLogPageList(QueryTagReceiveJinDouLogIn pageIn);

    @DataSource("master")
    public Integer getRecommendLookTagReceiveJinDouLogPageTotal(QueryTagReceiveJinDouLogIn pageIn);

    @DataSource("master")
    public Integer updateRecommendLookTagReceiveJinDouLog(RecommendLookTagReceiveJinDouLog jinDouLog);

}
