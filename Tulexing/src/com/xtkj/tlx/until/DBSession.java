package com.xtkj.tlx.until;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class DBSession {
	private Configuration con;
	private SessionFactory sf;
	@Test
	public org.hibernate.Session getSession(){
		con=new Configuration().configure();
		sf=con.buildSessionFactory();
		org.hibernate.Session session=sf.openSession();
		return session;
	}
}
