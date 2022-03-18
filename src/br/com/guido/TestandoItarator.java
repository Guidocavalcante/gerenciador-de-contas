package br.com.guido;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoItarator {

	    public static void main(String[] args) {

	        List<String> letras = new LinkedList<>();
	        letras.add("A");
	        letras.add("B");
	        letras.add("C");
	        //...
	        
	        Iterator<String> iterador = letras.iterator();
	        while(iterador.hasNext()) {
	        	System.out.println(iterador.next());
	        	
	        }
	        
	    }
	}

