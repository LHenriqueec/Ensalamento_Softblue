package com.softblue.service;

import java.util.List;

import com.softblue.dao.AlunoDAO.Ordem;
import com.softblue.dao.DAOException;
import com.softblue.entity.Aluno;
import com.softblue.entity.Sala;

public class SalaService extends Service {

	public List<Sala> getSalas() throws ServiceException {
		try {
			
			return daoFactory.getSalaDAO().getSalas();
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	public List<Aluno> getAlunoBySala(int numSala, Ordem ordem) throws ServiceException {
		
		try {
			
			return daoFactory.getAlunoDAO().getAlunosBySala(numSala, ordem);
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	public Sala loadSala(int numSala) throws ServiceException {
		try {
			
			return daoFactory.getSalaDAO().ler(numSala);
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
}













