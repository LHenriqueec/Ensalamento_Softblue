package com.softblue.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.softblue.util.HibernateUtil;

public abstract class DAO<T> {

	private Session session;
	private Class<T> clazz;
	
	
	public DAO(Class<T> clazz) {
		this.clazz = clazz;
		session = HibernateUtil.getSession();
	}
	
	public void salvar(T obj) throws DAOException {
		try {
			session.save(obj);
		} catch (HibernateException e) {
			throw new DAOException();
		}
		
	}
	
	public T ler(Serializable id) throws DAOException {
		try {
			return session.load(clazz, id);
		} catch (HibernateException e) {
			throw new DAOException();
		}
	}
	
	public void alterar(T obj) throws DAOException {
		try {
			session.update(obj);
		} catch (HibernateException e) {
			throw new DAOException();
		}
	}
	
	public void deletar(T obj) throws DAOException {
		try {
			session.delete(obj);
		} catch (HibernateException e) {
			throw new DAOException();
		}
	}
	
	public List<?> list(String hql) throws DAOException {
		try {
			Query q = session.createQuery(hql);
			return q.getResultList();
		} catch (HibernateException e) {
			throw new DAOException();
		}
	}
}







