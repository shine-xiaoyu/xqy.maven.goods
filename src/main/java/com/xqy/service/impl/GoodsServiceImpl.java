package com.xqy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xqy.dao.GoodsDao;
import com.xqy.entity.Goods;
import com.xqy.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsDao goodsDao;
	
	@Override
	public List<Goods> select() {
		return goodsDao.select();
	}

}
