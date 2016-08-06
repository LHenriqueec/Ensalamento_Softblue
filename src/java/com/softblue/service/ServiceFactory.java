package com.softblue.service;

public class ServiceFactory {

	private static ServiceFactory instance;
	
	private ServiceFactory() {}
	
	
	public static ServiceFactory getInstance() {
		
		if(instance == null) {
			instance = new ServiceFactory();
		}
		
		return instance;
	}
	
	public AlunoService getAlunoService() {
		return new AlunoService();
	}
	
	public SalaService getSalaService() {
		return new SalaService();
	}
	
	public EnsalamentoService getEnsalamentoService() {
		return new EnsalamentoService();
	}
}
