package br.com.streams;

import java.util.stream.Stream;

public class StreamsMatch {

	public static void main(String[] args) {

		boolean anyMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8).anyMatch(e -> e > 5); // verifica se algum elemento é maior que 5
		System.out.println("anyMatch: " + anyMatch);	

		boolean allMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8).allMatch(e -> e > 5); // verifica se TODOS os elementos são maiores que 5
		System.out.println("allMatch: " + allMatch);
		
		boolean noneMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8).noneMatch(e -> e > 5);
		System.out.println("noneMatch: " + noneMatch);
		
	}

}
