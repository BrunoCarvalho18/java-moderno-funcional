package br.com.streams;

import java.util.Arrays;

public class StreamArraysStream {

	public static void main(String[] args) {

		String[] array = new String[] { "A", "B", "C" };

		// Cria��o de um Stream a partir do array e, para
		// cada elemento, o m�todo println � chamado.
		
		Arrays.stream(array).forEach(System.out::println);

	}

}
