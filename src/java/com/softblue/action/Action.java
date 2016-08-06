package com.softblue.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.softblue.service.ServiceFactory;
import com.softblue.util.HibernateUtil;

public abstract class Action {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected ServiceFactory serviceFactory;
	
	
	public Action() {
		serviceFactory = ServiceFactory.getInstance();
	}
	
	public abstract void process() throws Exception;
	
	public void runAction() throws Exception {

		try {
		
			HibernateUtil.getSession().beginTransaction();
			process();
			HibernateUtil.commitTransaction();
		
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw e;
		}
	}
	
	public HttpSession getSession() {
		return request.getSession();
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	public HttpServletResponse getResponse() {
		return response;
	}
	
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	public void forward(String path) throws Exception {
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	public void redirect(String path) throws Exception {
		response.sendRedirect(path);
	}
}














