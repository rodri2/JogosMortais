package br.edu.ifal;

public class Professor {
	private String nome;
	private String formacao;
	private String cpf;
	
	public Professor() {
		super();
		nome = "";
		formacao = "";
		cpf = "";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", formacao=" + formacao + ", cpf=" + cpf + "]";
	}

}
