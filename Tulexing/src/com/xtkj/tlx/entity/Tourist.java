package com.xtkj.tlx.entity;

import java.io.Serializable;
/*
 * 声明游客信息表
 */
public class Tourist implements Serializable {
	private String touristID;//游客信息编号
	private String IDCard;//游客身份证号
	private String tel;//游客手机号码
	private String realName;//游客真实姓名
	public String getTouristID() {
		return touristID;
	}
	public void setTouristID(String touristID) {
		this.touristID = touristID;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
}
