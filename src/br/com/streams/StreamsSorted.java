package br.com.streams;

import java.util.Arrays;

public class StreamsSorted {

	public static void main(String[] args) {

		// Criação de um array comum de Strings
		String[] array = new String[] { "A", "C", "B", "D", "E", "F", "G", "H","J", "I" };
		Arrays.stream(array)
		        .sorted() // ordena utilizando a ordem natural
				.forEach(System.out::println);

	}

}
