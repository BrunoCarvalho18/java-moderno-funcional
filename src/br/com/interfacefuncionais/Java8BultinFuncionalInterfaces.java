package br.com.interfacefuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Java8BultinFuncionalInterfaces {
	
	public static void main(String[] args) {
		
		//generate ---> Supplier
	    //forEach ----> Consumer ----> recebe um valor e não retorna nada
		//BiConsumer--> Aceita 2 parametros no método
		//BiPredicate--> Faz teste com esses dois valores, ou comparando um com outro
		Stream
		      .generate(()-> new Random().nextInt())
		      .limit(5)
		      .forEach(System.out::println);
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5);
		lista.stream()
		    .filter(e-> e % 2==0) // predicate
		    .map(e->e.doubleValue()) // function
		    .reduce((e1,e2)-> e1 + e2) // BinaryOperator
		    .ifPresent(System.out::println);
	}

}
