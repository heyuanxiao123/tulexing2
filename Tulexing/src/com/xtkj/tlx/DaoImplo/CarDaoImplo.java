package com.xtkj.tlx.DaoImplo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xtkj.tlx.entity.Car;
import com.xtkj.tlx.until.DBSession;
import com.xtkj.ylx.dao.CarDao;

public class CarDaoImplo implements CarDao{
	private DBSession dbsession=new DBSession();
	private Session session=dbsession.getSession();
	private Transaction tran;
	@Override
	public void addCar(Car c1) {
		tran=session.beginTransaction();
		session.save(c1);
		this.close();
	}

	@Override
	public List<Car> findAllCar() {
		String hql="from Car";
		Query query=session.createQuery(hql);
		List<Car> list=query.list();
		return list;
	}

	@Override
	public void deleteByID(Car a) {
		tran=session.beginTransaction();
		session.delete(a);
		this.close();
	}

	@Override
	public void updateByID(Car a) {
		tran=session.beginTransaction();
		session.update(a);
		this.close();
	}
	public void close(){
		if(session.isOpen()){
			tran.commit();
			session.close();
		}
	}
}
