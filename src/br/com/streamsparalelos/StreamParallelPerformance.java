package br.com.streamsparalelos;

import java.util.stream.IntStream;

public class StreamParallelPerformance {
	
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		IntStream.range(0, Integer.MAX_VALUE) // stream sequencial
		.mapToDouble(n -> Math.pow(n, 2))
		.average()
		.ifPresent(n -> System.out.println("Tempo stream sequencial: " + (System
		.currentTimeMillis() - inicio)));
		
		long inicio2 = System.currentTimeMillis();
		IntStream.range(0, Integer.MAX_VALUE)
		.parallel() // stream paralelo
		.mapToDouble(n -> Math.pow(n, 2))
		.average()
		.ifPresent(n -> System.out.println("Tempo stream paralelo: " + (System
		.currentTimeMillis() - inicio2)));
		
	}

}
