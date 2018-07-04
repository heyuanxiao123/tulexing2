package com.xtkj.tlx.entity;

import java.io.Serializable;
import java.util.Date;
/*
 * 声明购物车实体类
 */
public class Car implements Serializable {
	private int carID;//购物车ID
	private int customerID;//会员ID
	private String lineID;//线路ID
	private Date time;//购物车添加的时间
	public int getCarID() {
		return carID;
	}
	public void setCarID(int carID) {
		this.carID = carID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getLineID() {
		return lineID;
	}
	public void setLineID(String lineID) {
		this.lineID = lineID;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
