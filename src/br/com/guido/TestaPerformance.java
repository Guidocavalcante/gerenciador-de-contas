package br.com.guido;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros = new HashSet<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i <=50000; i++) {
			numeros.add(i);
		}
		long meio = System.currentTimeMillis();
		long tempocriação = meio - inicio;
		
		System.out.println(tempocriação);
		
		for (Integer numero : numeros) {
			numeros.contains(numero);		
		}
		long fim = System.currentTimeMillis();
		long tempopesquisa = fim - meio;
		System.out.println(tempopesquisa);
	}

}
