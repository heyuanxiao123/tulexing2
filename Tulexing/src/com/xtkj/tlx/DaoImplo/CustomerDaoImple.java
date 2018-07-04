package com.xtkj.tlx.DaoImplo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xtkj.tlx.entity.Customer;
import com.xtkj.tlx.until.DBSession;
import com.xtkj.ylx.dao.CustomerDao;

public class CustomerDaoImple implements CustomerDao {
	private DBSession dbsession=new DBSession();
	private Session session=dbsession.getSession();
	private Transaction tran;
	@Override
	public void addCustomer(Customer c) {
		tran=session.beginTransaction();
		session.save(c);
		close();
	}

	@Override
	public List<Customer> findAllCustomer() {
		String hql="from Customer";
		Query query=session.createQuery(hql);
		List<Customer> list=query.list();
		return list;
	}

	@Override
	public void delete(Customer c) {
		tran=session.beginTransaction();
		session.delete(c);
		close();
	}

	@Override
	public void update(Customer c) {
		tran=session.beginTransaction();
		session.update(c);
		close();
	}
	public void close(){
		if(session.isOpen()){
			tran.commit();
			session.close();
		}
	}
}
