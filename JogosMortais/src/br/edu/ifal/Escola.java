package br.edu.ifal;

import java.util.ArrayList;
import java.util.List;

public class Escola {

	private String nome;
	private List<Curso> cursos;
	private List<Professor> professores;
	
	public Escola() {
		super();
		nome = "";
		cursos = new ArrayList<>();
		professores = new ArrayList<>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		if (cursos != null) {
			this.cursos = cursos;
		}
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		if (professores != null) {
			this.professores = professores;
		}
		
	}

	@Override
	public String toString() {
		return "Escola: nome= " + nome + ", cursos= " + cursos + ", professores= " + professores;
	}
	
	
}
