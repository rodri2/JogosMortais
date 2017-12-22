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
	
}
