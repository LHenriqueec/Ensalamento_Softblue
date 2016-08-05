package com.softblue.entity;

public class Turma {

	private Integer id;
	private String nome;
	private Sala sala;
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
}
