package br.edu.ifal;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private List<Aluno>aluno;
	private List<Disciplina>disciplina;
	
	public Curso() {
		super();
		nome = "";
		aluno = new ArrayList<>();
		disciplina = new ArrayList<>();
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		if (aluno != null) {
			this.aluno = aluno;
		}
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		if (disciplina != null) {
			this.disciplina = disciplina;
		}
	}
	
	@Override
	public String toString() {
		return "Curso [aluno=" + aluno + "]";
	}
	
}
