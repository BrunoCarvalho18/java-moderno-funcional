package br.com.streams;

import java.util.stream.IntStream;

public class StreamsFilter {
	
	public static void main(String[] args) {
		
		Integer[] array = new Integer[] { 1, 2, 3, 4,5,6,7,8,9,10};
		
		IntStream.range(0, 10) // stream de 0 a 3
		.filter(e -> e % 2 == 0) // limita a números pares (resto da divisão por 2 é 0)
		.forEach(System.out::println); // imprime os elementos
	}

}
