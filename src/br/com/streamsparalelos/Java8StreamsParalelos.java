package br.com.streamsparalelos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamsParalelos {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

		// Ele imprimirá em ordem aleatória
		lista.parallelStream().forEach(System.out::println);
		System.out.println("----");

		// Ele imprimirá na mesma ordem
		lista.parallelStream().forEachOrdered(System.out::println);

		// findAny
		lista.parallelStream().findAny().ifPresent(System.out::println);
		System.out.println("----");
		lista.stream().findAny().ifPresent(System.out::println);
		System.out.println("----");

		// unordered
		lista.parallelStream().unordered().skip(1).limit(2).forEach(System.out::println);

		System.out.println("----");

		// reduce
		// (1+2) + (3+4)=10 = é associativa
		// (1-2) - (3-4) !=8 = não é associativa
		// Não vai ter garantia da operação com stream paralelo
		lista.parallelStream().reduce((n1, n2) -> n1 - n2).ifPresent(System.out::println);

		System.out.println("----");

		Map<Integer, Boolean> collect = lista.parallelStream().collect(Collectors.toMap(n -> n, n -> n % 2 == 0));

		System.out.println(collect);

		// ConcurrentMap é mais lento
		Map<Integer, Boolean> collect2 = lista.parallelStream()
				.collect(Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0));

		System.out.println(collect2);

		// Grouping By se tiver varias threads
		Map<Boolean, List<Integer>> collect3 = lista.parallelStream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0));

		System.out.println(collect3);
		
		Map<Boolean, List<Integer>> collect4 = lista.parallelStream()
				.collect(Collectors.groupingByConcurrent(n -> n % 2 == 0));

		System.out.println(collect4);
	}

}
