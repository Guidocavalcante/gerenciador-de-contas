package br.com.guido;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
public static void main(String[] args) {
	Set<String> alunos = new HashSet<>();
	alunos.add("Rodrigo Turini");
	alunos.add("Alberto Souza");
	alunos.add("Nico Steppat");
	alunos.add("Sergio Lopes");
	alunos.add("Rennan Saggio");
	alunos.add("Mauricio Aniche");
	
	boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
	System.out.println(pauloEstaMatriculado);
	
	for (String aluno : alunos) {
		System.out.println(aluno);
	}
	
	
	System.out.println(alunos);
	
	
	
	
	
}
}
