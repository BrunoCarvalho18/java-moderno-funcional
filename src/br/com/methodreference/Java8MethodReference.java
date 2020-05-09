package br.com.methodreference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Java8MethodReference {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

		lista.stream().forEach(System.out::println); // method reference

		lista.stream().forEach((n) -> System.out.println(n)); // sem method reference

		// métodos estáticos
		lista.stream()
		.map((n) -> multipliquePorDois(n))
		.forEach(System.out::println);
		
		lista.stream()
		  .map(Java8MethodReference::multipliquePorDois)
		  .forEach(System.out::println);
		
		// construtores
		lista.stream()
		   .map((n)-> new BigDecimal(n))
		   .forEach(System.out::println);
		
		lista.stream()
		    .map(BigDecimal::new)
		    .forEach(System.out::println);
		
		// varias instâncias
		lista.stream()
		    .map((n)-> n.doubleValue())
		    .forEach(System.out::println);
		
		lista.stream()
		    .map(Integer::doubleValue)
		    .forEach(System.out::println);
		
		BigDecimal dois  = new BigDecimal(2);
		lista
		    .stream()
		    .map(BigDecimal::new)
		    .map((b)->dois.multiply(b))
		    .forEach(System.out::println);
		
		lista
		.stream()
		 .map(BigDecimal::new)
		 .map(dois::multiply)
		 .forEach(System.out::println);
	}

	private static Integer multipliquePorDois(Integer i) {
		return i * 2;

	}

}
