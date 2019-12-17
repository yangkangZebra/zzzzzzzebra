package com.yk.demo.pojo;

import java.io.Serializable;

/* 
CREATE TABLE IF NOT EXISTS  shop(
    id int primary key auto_increment,
    shop_name varchar(20) comment "名称",
	address varchar(100) comment "地址",
    description varchar(100) comment "描述",
	duty_user varchar(20) comment "负责人"
);
*/
/**
 * 店铺信息
 * @author zebra
 * @date 2019年12月10日 下午4:08:03
 */
public class Shop implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 123564564841564L;
	/**
	 * 自增长ID，店铺编号
	 */
	Integer id;
	/**
	 * 店铺名称
	 */
	String shopName;
	/**
	 * 店铺地址
	 */
	String address;
	/**
	 * 店铺描述
	 */
	String description;
	/**
	 * 店铺负责人
	 */
	String dutyUser;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDutyUser() {
		return dutyUser;
	}
	public void setDutyUser(String dutyUser) {
		this.dutyUser = dutyUser;
	}
}
