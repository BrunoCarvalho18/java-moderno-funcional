package br.com.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindFirstAny {
	
	public static void main(String[] args) {
		
		Optional<Integer> findFirst = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) .findFirst(); // pega o primeiro número do Stream
		System.out.println("First: " + findFirst.get());
		
		Optional<Integer> findAny = Stream.of(7, 2, 1, 8, 4, 9, 2, 8).findAny(); // pega qualquer número do Stream
	    System.out.println("Any: " + findAny.get());
	}

}
