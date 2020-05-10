package br.com.optional;

import java.util.Optional;

public class BuiltInInterfacesOptionalOrElseThrow {
	
	public static void main(String[] args) {
		Optional<String> optionalVazio = Optional.empty();
		Optional<String> optionalComValor = Optional.of("valor");
		
		String orElseThrow1 = optionalComValor.orElseThrow(() -> new RuntimeException());
		System.out.println(orElseThrow1);
	
		String orElseThrow2 = optionalVazio.orElseThrow(() -> new RuntimeException());
		System.out.println(orElseThrow2);
	}

}
