package com.softblue.dao;

public class DAOFactory {

	private static DAOFactory instance;
	
	private DAOFactory() {}
	
	public static DAOFactory getInstance() {
		
		if (instance == null) {
			instance = new DAOFactory();
		}
		
		return instance;
	}
	
	
	public AlunoDAO getAlunoDAO() {
		return new AlunoDAO();
	}
	
	public SalaDAO getSalaDAO() {
		return new SalaDAO();
	}
}
