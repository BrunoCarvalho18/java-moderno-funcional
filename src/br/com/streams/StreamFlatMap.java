package br.com.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMap {
	
	public static void main(String[] args) {
		
		// Criação de 3 arrays distintos
		String[] array1 = new String[] { "A", "B", "C" };
		String[] array2 = new String[] { "D", "E", "F" };
		String[] array3 = new String[] { "G", "H", "I" };
		
		Stream.of(array1, array2, array3) // criação de um Stream de Arrays
		.flatMap(a -> Arrays.stream(a)) // transforma os dados de cada array em um único fluxo de dados
		.forEach(System.out::println); // imprime os elementos
	}

}
