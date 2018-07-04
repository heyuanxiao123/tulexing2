package com.xtkj.tlx.entity;

import java.io.Serializable;
/*
 * 声明线路图片实体类
 */
public class Picture implements Serializable {
	private int pictureID;//图片编号
	private String introduction;//图片介绍
	private String name;//图片名称
	private String lineID;//线路编号
	public int getPictureID() {
		return pictureID;
	}
	public void setPictureID(int pictureID) {
		this.pictureID = pictureID;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLineID() {
		return lineID;
	}
	public void setLineID(String lineID) {
		this.lineID = lineID;
	}
	
}
