package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Alunos")
public class Aluno extends Pessoa {
	
	@Column(nullable = false, unique = true)
	private int matricula;
	@Column(nullable = false)
	private String curso;
	
	public Aluno() {
		
	}

	public Aluno(int id, String nome, String email, int matricula, String curso) {
		super(id, nome, email);
		this.matricula = matricula;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
