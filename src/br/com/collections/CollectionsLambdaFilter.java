package br.com.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionsLambdaFilter {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1, 6, 8, 7, 2, 9);
		lista.stream()
		.filter(n -> n > 2)
		.forEach(System.out::println);
	}

}
