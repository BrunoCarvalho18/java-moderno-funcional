package br.com.streams;

import java.util.stream.IntStream;

public class StreamIntRange {
	
	public static void main(String[] args) {
		
		Integer[] array = new Integer[] { 1, 2, 3, 4 };
		
		IntStream.range(0, 4).forEach(System.out::println);
	}

}
