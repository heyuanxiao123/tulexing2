package com.xtkj.tlx.entity;

import java.io.Serializable;
import java.util.Date;
/*
 * 声明线路类型实体类
 */
public class LineType implements Serializable {
	private String lineTypeID;//线路类型编号
	private String typeName; 	//线路类型名字
	private Date time;			//线路类型添加时间
	private String icon;		//线路类型图标名
	private int state;
	public String getLineTypeID() {
		return lineTypeID;
	}
	public void setLineTypeID(String lineTypeID) {
		this.lineTypeID = lineTypeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
