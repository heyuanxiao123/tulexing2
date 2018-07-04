package com.xtkj.tlx.DaoImplo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xtkj.tlx.until.DBSession;
import com.xtkj.ylx.dao.TouristDao;

public class TouristDaoImple implements TouristDao {
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
		String hql="from Tourist";
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

	@Override
	public int findAllTouristCount() {
		String hql="select count(*) from Tourist";
		Query query=session.createQuery(hql);
		int a=(int) query.uniqueResult();
		return a;
	}

}
