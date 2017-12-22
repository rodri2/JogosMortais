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
	
	
}
