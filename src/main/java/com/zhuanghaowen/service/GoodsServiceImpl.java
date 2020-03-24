package com.zhuanghaowen.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuanghaowen.bean.Goods;
import com.zhuanghaowen.bean.Type;
import com.zhuanghaowen.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	GoodsMapper goodsmapper;

	public List<Goods> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsmapper.queryAll(map);
	}

	public List<Type> queryType() {
		// TODO Auto-generated method stub
		return goodsmapper.queryType();
	}

	public void addGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsmapper.addGoods(goods);
	}

	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsmapper.updateGoods(goods);
	}

	public void deleteGoods(String ids) {
		// TODO Auto-generated method stub
		goodsmapper.deleteGoods(ids);
	}
}
