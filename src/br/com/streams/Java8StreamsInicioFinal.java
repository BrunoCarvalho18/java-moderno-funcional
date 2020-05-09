package br.com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8StreamsInicioFinal {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 6, 6, 9, 9);

		// Java 8
		// stream é um loop implícito	
		long count = lista.stream()
		      .limit(12)
		      .map(e -> e * 2)
		      .count();

		System.out.println("contando: "+count);
		
		Optional<Integer> min = lista.stream()
				.filter(e->e%2==0)
				.min(Comparator.naturalOrder());
		
		System.out.println("número mínimo par: " +min.get());
		
		
		List<Integer> novaLista = lista.stream()
				.filter(e->e%2==0)
				.collect(Collectors.toList());
		
		System.out.println("somente os números pares: " + novaLista);
		
		
		Map<Integer,List<Integer>> mapa = lista.stream()
				.map(e->e*3)
				.collect(Collectors.groupingBy(e->e%3));
		
		System.out.println("este é o mapa: "+ mapa);
		
		String collect = lista.stream()
				.map(e->String.valueOf(e))
				.collect(Collectors.joining(";"));
		
		System.out.println("Adicionando ponto e virgula virgula: " + collect);
		
	}

}
