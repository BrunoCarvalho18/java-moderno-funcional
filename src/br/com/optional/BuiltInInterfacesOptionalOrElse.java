package br.com.optional;

import java.util.Optional;

public class BuiltInInterfacesOptionalOrElse {

	public static void main(String[] args) {
		
		Optional<String> optionalVazio = Optional.empty();
		String orElse = optionalVazio.orElse("valor padrao"); 
		String orElseGet = optionalVazio.orElseGet(() -> { return "valor padrao"; }); 
		System.out.println(orElse);
		System.out.println(orElseGet);
		
		Optional<String> optionalComValor = Optional.of("valor");
		String orElse2 = optionalComValor.orElse("valor padrao");
		String orElseGet2 = optionalComValor.orElseGet(() -> { return "valor padrao"; });
		System.out.println(orElse2);
		System.out.println(orElseGet2);

	}

}
