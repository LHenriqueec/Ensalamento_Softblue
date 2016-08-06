package com.softblue.service;

import com.softblue.dao.DAOException;
import com.softblue.entity.Aluno;
import com.softblue.entity.Sala;

public class EnsalamentoService extends Service {

	public void removerAlunoSala(String matricula) throws ServiceException {
		
		try {
		
			daoFactory.getAlunoDAO().ler(matricula).setSala(null);
		
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	public void adicionarAlunoSala(String matricula, int numSala) throws ServiceException {
		
		try {
		
			Aluno aluno = daoFactory.getAlunoDAO().ler(matricula);
			Sala sala = daoFactory.getSalaDAO().ler(numSala);
			aluno.setSala(sala);
		
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}


	public Sala getSalaByAluno(String matricula) throws ServiceException {
		
		try {
		
			return daoFactory.getSalaDAO().getSalaByAluno(matricula);
		
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
}










