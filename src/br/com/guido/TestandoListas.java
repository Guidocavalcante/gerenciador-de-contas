package br.com.guido;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";
		ArrayList<String> aulas = new ArrayList<String>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: "+ aula);
		}
			
			aulas.forEach(aula -> {
				System.out.println("percorrendo:");
				System.out.println("aula: " + aula);
			});
			
			
			
		}
	}


