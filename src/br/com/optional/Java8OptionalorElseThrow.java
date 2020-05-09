package br.com.optional;

import java.util.Optional;

public class Java8OptionalorElseThrow {
	
	public static void main(String[] args) {
	    String s = 	"Inscreva-se!";
		Integer numero = converteEmNumero(s)
				.orElseThrow(()-> new NullPointerException("Valor Vazio."));
		System.out.println(numero);
	}
	
	public static Optional<Integer> converteEmNumero(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();
		}
		
		
	}


}
