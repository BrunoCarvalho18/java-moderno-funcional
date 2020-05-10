package br.com.methodreference;

import java.util.function.Function;

public class MethodReferenceComplex {
	
	public static void main(String[] args) {
		Function<String, Integer> stringParaInteger1 = s -> new Integer(s + "2");
		System.out.println(stringParaInteger1.apply("1"));
	}

}
