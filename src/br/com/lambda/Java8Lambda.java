package br.com.lambda;

import java.util.stream.IntStream;

public class Java8Lambda {

	public static void main(String[] args) {
		
		//Parêntes são obrigatórios para declarar o tipo, ou com mais de uma função
		IntStream.range(0, 5)
		        .filter((int n) -> n % 2 == 0) // parenteses posso declarar o tipo que é int
				.reduce((n1, n2) -> n1 + n2)
				.ifPresent(System.out::println);
		
		//Chaves para mais de uma função
		IntStream.range(0, 5)
		    .filter((int n)->{
		    	System.out.println("Se increva no canal");
		    	return n % 2 == 0;
		    })
		    .forEach(System.out::println);
     }

}
