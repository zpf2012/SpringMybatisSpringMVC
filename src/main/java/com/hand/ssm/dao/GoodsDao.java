package com.hand.ssm.dao;

import com.hand.ssm.dto.Goods;

public interface GoodsDao {

	Goods getGoodByPrimaryKey(long goodId);
	
}
