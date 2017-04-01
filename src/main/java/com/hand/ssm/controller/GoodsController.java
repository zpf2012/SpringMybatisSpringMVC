package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dto.Goods;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsDao goodsDao;
	
	@RequestMapping("/good")
	public String getGood(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		long id = Long.valueOf(request.getParameter("id"));
		
		Goods goods = goodsDao.getGoodByPrimaryKey(id);
		modelAndView.addObject("good", goods);
		return "success";
	}

}
