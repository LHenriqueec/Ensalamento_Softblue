package com.softblue.service;

import java.util.List;

import com.softblue.dao.DAOException;
import com.softblue.entity.Aluno;

public class AlunoService extends Service {

	public List<Aluno> getAlunosByNome(String nome) throws ServiceException {
		try {
			
			return daoFactory.getAlunoDAO().getAlunosNaoEnsaladosByNome(nome);
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
}
