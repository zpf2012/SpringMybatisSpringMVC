package com.hand.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dto.Goods;
import com.hand.ssm.service.GoodsService;

public class GoodServiceImpl implements GoodsService{
	
	@Autowired
	GoodsDao goodsDao;

	@Override
	public Goods getGood(long goodId) {
		Goods goods = goodsDao.getGoodByPrimaryKey(goodId);
		return goods;
	}

}
