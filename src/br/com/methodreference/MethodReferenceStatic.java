package br.com.methodreference;

import java.util.function.Function;

public class MethodReferenceStatic {

	public static void main(String[] args) {
		
		// representação com expressão lambda
		Function<Integer, String> converteIntEmStr1 = x -> String.valueOf(x);
		
		// representação com referência ao método
		Function<Integer, String> converteIntEmStr2 = String::valueOf;
		System.out.println(converteIntEmStr1.apply(5));
		System.out.println(converteIntEmStr2.apply(5));
	}

}
