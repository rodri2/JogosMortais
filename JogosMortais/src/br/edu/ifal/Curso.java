package br.edu.ifal;

import java.util.List;

public class Curso {
	private String nome;
	private List<Aluno>aluno;
	private List<Disciplina>disciplina;
	
	public Curso() {
		super();
		nome = "";
		aluno = "";
		disciplina = ""
	}

	@Override
	public String toString() {
		return "Curso [aluno=" + aluno + "]";
	}
	
	
	
}
