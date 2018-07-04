package com.xtkj.ylx.dao;

import java.util.List;

import com.xtkj.tlx.entity.Car;

public interface CarDao {
	//增加购物车
	public void addCar(Car c1);
	//查询所有购物车
	public List<Car> findAllCar();
	//通过id删除
	public void deleteByID(Car a);
	//通过ID修改
	public void updateByID(Car a);
}
