package com.softblue.entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sala {

	private Integer numero;
	private Integer capacidade;
	private Turma turma;
	private Set<Aluno> alunos = new LinkedHashSet<>();
	
	public Integer getNumero() {
		return numero;
	}
	
	public Integer getCapacidade() {
		return capacidade;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
}
