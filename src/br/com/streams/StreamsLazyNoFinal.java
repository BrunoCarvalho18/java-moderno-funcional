package br.com.streams;

import java.util.stream.IntStream;

public class StreamsLazyNoFinal {

	public static void main(String[] args) {
		
		//Nada ir� acontecer se n�o tiver uma opera��o no stream
				
		IntStream.range(0, 4)
		.filter(e -> e % 2 == 0)
		.limit(3)
		.map(e -> e * 2)
		.peek(System.out::println);
		
		
	}

}
