package com.xtkj.tlx.entity;

import java.io.Serializable;
import java.util.Date;
/*
 * 声明线路实体类
 */
public class Line implements Serializable {
	private String lineID;//线路编号
	private String lineTypeID;//线路类型编号
	private String lineName;//线路名称
	private int days;		//出游天数
	private double price;   //线路价格
	private String vehicle;	//出游的交通工具
	private int teamBuy;//是否为团购 1表示可以团购
	private double teamBuyPrice;//团购价
	private String introduction;//线路简介
	private String reason;		//推荐理由
	private String arrange;		//线路行程安排
	private Date beginTime;		//团购开始时间
	private Date endTime;		//团购结束时间
	private Date onTime;		//线路添加时间
	private double discount;
	
	public String getLineID() {
		return lineID;
	}
	public void setLineID(String lineID) {
		this.lineID = lineID;
	}

	public String getLineTypeID() {
		return lineTypeID;
	}
	public void setLineTypeID(String lineTypeID) {
		this.lineTypeID = lineTypeID;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public int getTeamBuy() {
		return teamBuy;
	}
	public void setTeamBuy(int teamBuy) {
		this.teamBuy = teamBuy;
	}
	public double getTeamBuyPrice() {
		return teamBuyPrice;
	}
	public void setTeamBuyPrice(double teamBuyPrice) {
		this.teamBuyPrice = teamBuyPrice;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getArrange() {
		return arrange;
	}
	public void setArrange(String arrange) {
		this.arrange = arrange;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getOnTime() {
		return onTime;
	}
	public void setOnTime(Date onTime) {
		this.onTime = onTime;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
