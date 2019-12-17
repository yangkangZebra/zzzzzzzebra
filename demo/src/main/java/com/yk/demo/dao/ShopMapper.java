package com.yk.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yk.demo.pojo.Shop;

@Repository
public interface ShopMapper {
	Shop selectById(@Param("id")int id);
}
