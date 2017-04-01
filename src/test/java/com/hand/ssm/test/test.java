package com.hand.ssm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dto.Goods;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
		GoodsDao goodsDao =  (GoodsDao) context.getBean("goodsDao");
		Goods goods = goodsDao.getGoodByPrimaryKey(1000);
		System.out.println(goods);
		
		
	}

}
