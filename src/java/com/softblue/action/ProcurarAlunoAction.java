package com.softblue.action;

import java.util.List;

import com.softblue.entity.Aluno;

public class ProcurarAlunoAction extends Action {

	@Override
	public void process() throws Exception {
		
		String nome = getRequest().getParameter("nome");
		String numSala = getRequest().getParameter("numSala");
		
		getRequest().setAttribute("numSala", numSala);
		
		if (nome == null) {
			List<Aluno> alunos = serviceFactory.getAlunoService().getAlunosByNome(nome);
			getRequest().setAttribute("alunos", alunos);
		}
		
		forward("procurar_alunos.jsp");
	}
}
