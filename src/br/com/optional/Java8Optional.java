package br.com.optional;

import java.util.Optional;

public class Java8Optional {
	
	public static void main(String[] args) {
		
		String s = "Inscreva-se no canal";
		Optional<Integer> numero = converteEmNumero(s);
		System.out.println(numero);
		
	}
	
	// Não pode criar um optional passando nulo
	public static Optional<Integer> converteEmNumero(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();
		}
		
		
	}

}
