package br.com.methodreference;

import java.util.function.Function;

public class MethodReferenceStatic {

	public static void main(String[] args) {
		
		// representa��o com express�o lambda
		Function<Integer, String> converteIntEmStr1 = x -> String.valueOf(x);
		
		// representa��o com refer�ncia ao m�todo
		Function<Integer, String> converteIntEmStr2 = String::valueOf;
		System.out.println(converteIntEmStr1.apply(5));
		System.out.println(converteIntEmStr2.apply(5));
	}

}
