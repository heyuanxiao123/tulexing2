package com.xtkj.tlx.entity;

import java.io.Serializable;
import java.util.Date;
/*
 * 声明订单实体类
 */
public class OrderDetail implements Serializable {
	private String odID;//订单编号
	private int customerID;//客户编号
	private String lineName;//线路名称
	private double price;	//价格
	private Date orderDate;	//下单时间
	private Date travelDate;//出游时间
	private double total;	//总价
	private String lineID;	//线路编号
	private int state;		//订单显示状态，1显示 0不显示
	public String getOdID() {
		return odID;
	}
	public void setOdID(String odID) {
		this.odID = odID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getLineID() {
		return lineID;
	}
	public void setLineID(String lineID) {
		this.lineID = lineID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
