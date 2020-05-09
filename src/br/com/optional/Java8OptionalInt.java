package br.com.optional;

import java.util.OptionalInt;

public class Java8OptionalInt {
	
	public static void main(String[] args) {
	    String s = 	"Inscreva-se!";
		Integer numero = converteEmNumero(s)
				.orElseThrow(()-> new NullPointerException("Valor Vazio."));
		System.out.println(numero);
	}
	
	public static OptionalInt converteEmNumero(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return OptionalInt.of(integer);
		} catch (Exception e) {
			return OptionalInt.empty();
		}
		
		
	}


}
