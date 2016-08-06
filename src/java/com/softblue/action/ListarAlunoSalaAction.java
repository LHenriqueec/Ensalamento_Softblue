package com.softblue.action;

import java.util.List;

import com.softblue.dao.AlunoDAO;
import com.softblue.entity.Aluno;
import com.softblue.entity.Sala;

public class ListarAlunoSalaAction extends Action {

	@Override
	public void process() throws Exception {
		
		int numSala = Integer.parseInt(getRequest().getParameter("numSala"));
		String ordemStr = getRequest().getParameter("ordem");
		
		AlunoDAO.Ordem ordem = ordemStr == null ? AlunoDAO.Ordem.MATRICULA : AlunoDAO.Ordem.NOME;
		
		List<Aluno> alunos = serviceFactory.getSalaService().getAlunoBySala(numSala, ordem);
		Sala sala = serviceFactory.getSalaService().loadSala(numSala);
		
		getRequest().setAttribute("alunos", alunos);
		getRequest().setAttribute("numAlunos", alunos.size());
		getRequest().setAttribute("sala", sala);
		forward("lista_aluno.jsp");
	}
}
