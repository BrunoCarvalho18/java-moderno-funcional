package br.com.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsMaxMinCount {

	public static void main(String[] args) {

		// stream de vários Integer
		Optional<Integer> max = Stream.of(7, 2, 1, 8, 4, 9, 2, 8).max(Comparator.naturalOrder()); // pega o maior número
																									// do Stream
		System.out.println("Max: " + max.get());

		Optional<Integer> min = Stream.of(7, 2, 1, 8, 4, 9, 2, 8).min(Comparator.naturalOrder());
		System.out.println("Min: " + min.get());
		
		long count = Stream.of(7, 2, 1, 8, 4, 9, 2, 8).count(); 
		System.out.println("Count: " + count);
	}

}
