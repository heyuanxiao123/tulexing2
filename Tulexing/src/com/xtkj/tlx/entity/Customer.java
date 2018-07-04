package com.xtkj.tlx.entity;

import java.io.Serializable;
/*
 * 声明会员信息实体类
 */
public class Customer implements Serializable {
	private int customerID;//会员信息ID
	private String account;//会员账号
	private String name;//会员真实姓名
	private String password;//密码
	private String gender;	//性别
	private String identityID;//身份证号码
	private String tel;//手机号
	private int type;		//会员类型 1代表管理员
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdentityID() {
		return identityID;
	}
	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
