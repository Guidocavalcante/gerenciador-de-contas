package br.com.guido;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private int tempodeaula = 0;
	private String nome;
	private String instrutor;
	private List <Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public String getNome() {
		return nome;
	}
	public int getTempoDeAula() {
		return tempodeaula;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	

	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas); 
	}
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		tempodeaula += aula.getTempo();
	}
	
//	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
//	}
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoDeAula();
	}
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		}
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("Matrícula não encontrada!");

		return matriculaParaAluno.get(numero);
		
		//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == numero) 
//				return aluno;
//			
//			
//		}
//		throw new NoSuchElementException("Matrícula não encontrada!");
		
	}


	
} 
