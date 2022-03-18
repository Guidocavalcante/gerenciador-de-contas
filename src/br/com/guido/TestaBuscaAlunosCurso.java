package br.com.guido;

public class TestaBuscaAlunosCurso {
public static void main(String[] args) {
	
Curso javaColecoes = new Curso("Dominando coleções java", "Paulo Silveira");
	
	
	javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	javaColecoes.adiciona(new Aula("Criando Aula", 20));
	javaColecoes.adiciona(new Aula("Modelando com coleções", 25));
	
	Aluno a1 = new Aluno ("Rodrigo Torini", 681698);
	Aluno a2 = new Aluno("Guilherme Silveira", 684615);
	Aluno a3 = new Aluno("Mauricio Aniche", 548666);
	Aluno a4 = new Aluno("Guido Cavalcante", 1410509);

	javaColecoes.matricula(a1);
	javaColecoes.matricula(a2);
	javaColecoes.matricula(a3);
	javaColecoes.matricula(a4);
	
	System.out.println("Quem é o aluno de matrícula 684615?");
	Aluno aluno = javaColecoes.buscaMatriculado(684615);
	System.out.println("aluno: " + aluno);
}
}
