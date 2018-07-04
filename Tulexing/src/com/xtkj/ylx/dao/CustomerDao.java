package com.xtkj.ylx.dao;

import java.util.List;

import com.xtkj.tlx.entity.Customer;

public interface CustomerDao{
	public void addCustomer(Customer c);
	public List<Customer> findAllCustomer();
	public void delete(Customer c);
	public void update(Customer c);
}
