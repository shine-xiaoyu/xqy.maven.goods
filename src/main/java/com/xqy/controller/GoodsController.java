package com.xqy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xqy.entity.Goods;
import com.xqy.service.GoodsService;

@Controller
public class GoodsController {
	
	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("list")
	public String select(Model m) {
		List<Goods> goods = goodsService.select();
		m.addAttribute("goods", goods);
		return "list";
	}
	
}
