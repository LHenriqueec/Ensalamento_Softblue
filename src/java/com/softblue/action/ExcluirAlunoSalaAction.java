package com.softblue.action;

import com.softblue.entity.Sala;

public class ExcluirAlunoSalaAction extends Action {

	@Override
	public void process() throws Exception {
		String matricula = getRequest().getParameter("matricula");
		serviceFactory.getEnsalamentoService().removerAlunoSala(matricula);
		
		Sala sala = serviceFactory.getEnsalamentoService().getSalaByAluno(matricula);
		
		redirect("ListarAlunos.action?numSala="+sala.getNumero());
	}
	
}
