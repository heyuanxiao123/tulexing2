package com.xtkj.tlx.entity;

import java.io.Serializable;
/*
 * 声明订单游客实体类
 */
public class OT_Detail implements Serializable {
	private int otID;//订单游客编号
	private String odID;//订单编号
	private String touristID;//游客信息编号
	public int getOtID() {
		return otID;
	}
	public void setOtID(int otID) {
		this.otID = otID;
	}
	public String getOdID() {
		return odID;
	}
	public void setOdID(String odID) {
		this.odID = odID;
	}
	public String getTouristID() {
		return touristID;
	}
	public void setTouristID(String touristID) {
		this.touristID = touristID;
	}
	
}
