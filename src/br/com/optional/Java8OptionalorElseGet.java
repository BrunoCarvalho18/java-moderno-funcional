package br.com.optional;

import java.util.Optional;

public class Java8OptionalorElseGet {
	
	public static void main(String[] args) {
	    String s = 	"Inscreva-se!";
		Integer numero = converteEmNumero(s)
				.orElseGet(()-> 5); // Quando voc� tem uma fun��o lambda ele retorna uma fun��o pesada
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
