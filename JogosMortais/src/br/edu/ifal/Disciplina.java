package br.edu.ifal;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String nome;
	private Professor professor;
	private List<Aluno> aluno;
	
	public Disciplina(){
		super();
		nome = "";
		professor = new Professor();
		aluno = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		if (professor != null) {
			this.professor = professor;
		}
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", professor=" + professor + ", aluno=" + aluno + "]";
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		if (aluno != null) {
			this.aluno = aluno;
		}
	}
	
}
