package br.edu.ifal;

public class Aluno {
	private String nome;
	private String matricula;
	
	public Aluno() {
		super();
		nome = "";
		matricula = "";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno: nome = " + nome + ", matricula = " + matricula;
	}
	
	
	
	
}
