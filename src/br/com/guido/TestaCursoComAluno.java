package br.com.guido;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaCursoComAluno {
public static void main(String[] args) {
	
	Curso javaColecoes = new Curso("Dominando coleções java", "Paulo Silveira");
	
	
	javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	javaColecoes.adiciona(new Aula("Criando Aula", 20));
	javaColecoes.adiciona(new Aula("Modelando com coleções", 25));
	
	Aluno a1 = new Aluno ("Rodrigo Torini", 681698);
	Aluno a2 = new Aluno("Guilherme Silveira", 684615);
	Aluno a3 = new Aluno("Mauricio Aniche", 548666);
	Aluno a4 = new Aluno("Guido Cavalcante", 1410509);
	
//	Set<Aluno> alunos = new TreeSet<>(new ordenadorAlunos());
	javaColecoes.matricula(a1);
	javaColecoes.matricula(a2);
	javaColecoes.matricula(a3);
	javaColecoes.matricula(a4);
	
	System.out.println("Todos os alunos matriculados: ");
	
	Set<Aluno> alunos = javaColecoes.getAlunos();
	Iterator<Aluno> iterador = alunos.iterator();
	while(iterador.hasNext()) {
		Aluno proximo = iterador.next();
		System.out.println(proximo);
	}
//	
//	for (Aluno a : javaColecoes.getAlunos()) {
//		System.out.println(a);
//	}
	
//	javaColecoes.getAlunos().forEach(a -> {
//		System.out.println(a);
//	});
	Aluno torini = new Aluno("Rodrigo Torini", 681698);
	System.out.println("O aluno " + a1 + " está matriculado?");
	System.out.println(javaColecoes.estaMatriculado(torini));
	
	System.out.println("O aluno a1 é igual ao Torini?");
	System.out.println(a1.equals(torini));
	
	System.out.println(a1.hashCode() == torini.hashCode());
	
}
}
