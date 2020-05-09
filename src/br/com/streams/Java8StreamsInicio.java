package br.com.streams;

import java.util.Arrays;
import java.util.List;

public class Java8StreamsInicio {
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		
		// stream = fluxo de dados
		lista.stream().forEach(e->System.out.println("fluxo de dodos: "+ e));
		
		// stream
		lista.stream()
		      .skip(2) // opera��o intermedi�ria //pular 2 n�meros
		      .forEach(e->System.out.println("pular o fluxo de dados: "+e));
		
		//stream com limit
		lista.stream()
		     .limit(2) // Vai pegar os 2 primeiros da lista
		     .forEach(e->System.out.println("pegar os dois primeiros da lista: "+ e));
		
		//stream com distinct
		lista.stream()
		     .distinct() //equals e hashcode // n�o pode se repetir elemetos
		     .forEach(e->System.out.println("equals e hash code: "+e));
		
		//filtro aqueles que passarem no filter v�o at� o for each
		lista.stream()
		     .filter(e-> e % 2==0)
		     .forEach(e-> System.out.println("filtro com java: "+e));
		
		//lista original n�o � modificada com map
		lista.stream()
		     .map(e->e*2) // a lista original n�o � modificada
		     .forEach(e->System.out.println("lista modificada pelo map: "+e));
		     
		System.out.println("lista original: "+ lista);
	}

}
