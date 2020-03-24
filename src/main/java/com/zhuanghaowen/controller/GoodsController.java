package com.zhuanghaowen.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuanghaowen.bean.Goods;
import com.zhuanghaowen.bean.Type;
import com.zhuanghaowen.service.GoodsService;
import com.zhuanghaowen.utils.FileUtils;

@Service
public class GoodsController {

	@Autowired
	GoodsService goodsservice;
	
	@RequestMapping("list")
	public String queryAll(Model model,@RequestParam(defaultValue="1")Integer pageNum){
		Map<String,Object> map = new HashMap<String, Object>();
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = goodsservice.queryAll(map);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		return "list";
		
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model){
		List<Type> Typelist = goodsservice.queryType();
		model.addAttribute("Typelist", Typelist);
		
		return "add";
		
	}
	
	@RequestMapping("add")
	public String add(Goods goods,MultipartFile file){
		try {
			String upload = FileUtils.upload(file);
			goods.setGdatea(upload);
			
			goodsservice.addGoods(goods);
			return "redirect:list";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return "add";
		}
		
		
		
	}
	
	@RequestMapping("update")
	public String update(Goods goods,MultipartFile file){
		try {
			String upload = FileUtils.upload(file);
			goods.setGdatea(upload);
			
			goodsservice.addGoods(goods);
			return "redirect:list";
		}catch (Exception e) {
			// TODO Auto-generated catch block
			return "update";
		}
		
	}
	
	@RequestMapping("deleteGoods")
	@ResponseBody
	public boolean deleteGoods(String ids){
		goodsservice.deleteGoods(ids);
		return false;
	
	}
	
}
