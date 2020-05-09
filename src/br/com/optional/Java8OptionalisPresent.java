package br.com.optional;

import java.util.Optional;

public class Java8OptionalisPresent {
	
	public static void main(String[] args) {
	    String s = 	"1";
		Optional<Integer> numero = converteEmNumero(s);
		System.out.println(numero.isPresent()); // Da para usar o get também
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
