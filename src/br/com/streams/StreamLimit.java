package br.com.streams;

import java.util.stream.IntStream;

public class StreamLimit {
	
	public static void main(String[] args) {
		
		
		Integer[] array = new Integer[] { 1, 2, 3, 4 };
		
		IntStream.range(0, 4) // stream de 0 a 3
		.limit(2) // limita a 2 elementos
		.forEach(System.out::println); // imprime os elementos
	}

}
