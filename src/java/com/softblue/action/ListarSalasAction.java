package com.softblue.action;

import java.util.List;

import com.softblue.entity.Sala;

public class ListarSalasAction extends Action {

	@Override
	public void process() throws Exception {
		
		List<Sala> salas = serviceFactory.getSalaService().getSalas();
		getRequest().setAttribute("salas", salas);
		
		forward("lista_salas.jsp");
		
	}
}
