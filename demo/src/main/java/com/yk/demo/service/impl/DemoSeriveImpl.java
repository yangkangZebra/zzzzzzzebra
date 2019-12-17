package com.yk.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yk.demo.dao.ShopMapper;
import com.yk.demo.pojo.Shop;
import com.yk.demo.service.DemoSerive;

@Service
@Transactional
public class DemoSeriveImpl implements DemoSerive{

	@Autowired
	ShopMapper shopMapper;
	@Override
	public Shop selectById(int id) {
		return shopMapper.selectById(id);
	}

}
