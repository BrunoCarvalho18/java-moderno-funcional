package br.com.methodreference;

import java.util.function.Function;

public class MethodReferenceConstructor {

	public static void main(String[] args) {
		
		// representação com expressão lambda
		Function<String, Integer> stringParaInteger1 = s -> new Integer(s);
		// representação com referência ao construtor
		Function<String, Integer> stringParaInteger2 = Integer::new; //método com referência
		
		// os resultados serão iguais
		System.out.println(stringParaInteger1.apply("1"));
		System.out.println(stringParaInteger2.apply("1"));

	}

}
