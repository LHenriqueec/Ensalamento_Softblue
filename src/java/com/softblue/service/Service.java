package com.softblue.service;

import com.softblue.dao.DAOFactory;

public class Service {

	protected ServiceFactory serviceFactory;
	protected DAOFactory daoFactory;
	
	public Service() {
		serviceFactory = ServiceFactory.getInstance();
		daoFactory = DAOFactory.getInstance(); 
	}
}
