package com.xtkj.tlx.DaoImplo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xtkj.tlx.until.DBSession;
import com.xtkj.ylx.dao.OrderDetailDao;

public class OrderDetailDaoImple implements OrderDetailDao {
	private DBSession dbsession=new DBSession();
	private Session session=dbsession.getSession();
	private Transaction tran;
	@Override
	public void add(Object c1) {
		tran=session.beginTransaction();
		session.save(c1);
		close();

	}

	@Override
	public List<Object> findAll() {
		String hql="from OrderDetail";
		Query query=session.createQuery(hql);
		List<Object> list=query.list();
		return list;
	}

	@Override
	public void delete(Object a) {
		tran=session.beginTransaction();
		session.delete(a);
		close();

	}

	@Override
	public void update(Object a) {
		tran=session.beginTransaction();
		session.update(a);
		close();

	}

	@Override
	public void close() {
		if(session.isOpen()){
			tran.commit();
			session.close();
		}

	}

}
