package com.softblue.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {
		
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	
	public static Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public static void commitTransaction() {
		getSession().getTransaction().commit();
	}
	
	public static void rollbackTransaction() {
		getSession().getTransaction().rollback();
	}
}
