package com.softblue.action;

public class AdicionarAlunoSalaAction extends Action {

	@Override
	public void process() throws Exception {
		
		String matricula = getRequest().getParameter("Matricula");
		int numSala = Integer.parseInt(getRequest().getParameter("numSala"));
		
		serviceFactory.getEnsalamentoService().adicionarAlunoSala(matricula, numSala);
		
		redirect("ListarAlunos.action?numSala=" + numSala);
	}
}
