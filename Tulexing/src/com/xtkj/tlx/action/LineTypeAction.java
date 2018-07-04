package com.xtkj.tlx.action;

import com.xtkj.tlx.DaoImplo.TouristDaoImple;

public class LineTypeAction {
	public String findAll(){
		int touristacount=new TouristDaoImple().findAllTouristCount();
		return "success";
	}
}