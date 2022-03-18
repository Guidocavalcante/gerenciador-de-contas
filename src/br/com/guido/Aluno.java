package br.com.guido;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	/**
	 * @param nome
	 * @param numeroMatricula
	 */
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Não pode ser null!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}
	
}
