package com.softblue.dao;

import java.util.List;

import com.softblue.entity.Aluno;

public class AlunoDAO extends DAO<Aluno> {

	public enum Ordem {
		MATRICULA, NOME
	}
	
	public AlunoDAO() {
		super(Aluno.class);
	}
	
	public List<Aluno> getAlunosNaoEnsaladosByNome(String nome) throws DAOException {
		nome = nome.toUpperCase();
		String hql = "FROM Aluno a WHERE UPPER (a.nome) LIKE   '%" + nome + "%' AND a.sala IS NULL";
		return (List<Aluno>) list(hql);
	}
	
	public List<Aluno> getAlunosBySala(int numSala, Ordem ordem) throws DAOException {
		String hql = "FROM Aluno a WHERE a.sala.numero =" + numSala + "ORDER BY a." + ordem.name();
		return (List<Aluno>) list(hql);
	}
}
