package com.platform.spark.dao;

import java.util.List;

import com.platform.spark.domain.AdClickTrend;

/**
 * 广告点击趋势DAO接口
 * @author AllDataDC
 *
 */
public interface IAdClickTrendDAO {

	void updateBatch(List<AdClickTrend> adClickTrends);
	
}
