package com.softblue.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softblue.action.Action;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private static Properties action;
	
	static {
		
		try {
			InputStream is = ControllerServlet.class.getResourceAsStream("/action.properties");
			action = new Properties();
			action.load(is);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		String path = request.getServletPath();
		path = path.substring(1, path.indexOf("."));
		
		String actionClass =  action.getProperty(path);
		
		if (actionClass == null) {
			throw new ServletException("A action " + path + "não está mapeada.");
		}
		
		
		try {
		
			Action action = (Action) Class.forName(actionClass).newInstance();
			action.setRequest(request);
			action.setResponse(response);
			action.runAction();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}












