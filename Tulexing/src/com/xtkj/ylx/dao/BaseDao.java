package com.xtkj.ylx.dao;

import java.util.List;

import com.xtkj.tlx.entity.Car;

public interface BaseDao {
	public void add(Object c1);
	//查询所有
	public List<Object> findAll();
	//通过id删除
	public void delete(Object a);
	//通过ID修改
	public void update(Object a);
	public void close();
}
