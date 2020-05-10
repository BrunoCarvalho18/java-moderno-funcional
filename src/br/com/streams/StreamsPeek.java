package br.com.streams;

import java.util.Arrays;

public class StreamsPeek {
	
	public static void main(String[] args) {
		
		// Criação de um array comum de Strings
		String[] array = new String[] { "G", "T", "Y", "A" };
		
		Arrays.stream(array)
		.peek(e -> System.out.println("Peek: " + e)) // observa o que passou pelo Stream
		.forEach(e -> System.out.println("ForEach: " + e));
	}

}
