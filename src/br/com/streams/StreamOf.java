package br.com.streams;

import java.util.stream.Stream;

public class StreamOf {
	
	public static void main(String[] args) {
		
		Stream.of("A", 'B', 1, 2L, 3.0F, 4.0D).forEach(System.out::println);
	}

}
