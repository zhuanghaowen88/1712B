package com.zhuanghaowen.service;

import java.util.List;
import java.util.Map;

import com.zhuanghaowen.bean.Goods;
import com.zhuanghaowen.bean.Type;

public interface GoodsService {

	List<Goods> queryAll(Map<String,Object> map);
	
	List<Type> queryType();
	
	public void addGoods(Goods goods);
	public void updateGoods(Goods goods);
	public void deleteGoods(String ids);
}
