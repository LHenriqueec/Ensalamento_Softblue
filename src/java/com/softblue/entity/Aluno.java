package com.softblue.entity;

public class Aluno {

	private String matricula;
	private String nome;
	private Sala sala;
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
}
