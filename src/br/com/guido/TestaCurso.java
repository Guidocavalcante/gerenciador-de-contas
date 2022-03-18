package br.com.guido;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções java", "Paulo Silveira");
		
		
	//	javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}
