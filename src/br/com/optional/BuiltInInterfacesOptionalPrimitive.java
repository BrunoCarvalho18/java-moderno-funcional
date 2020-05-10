package br.com.optional;

import java.util.OptionalInt;

public class BuiltInInterfacesOptionalPrimitive {

	public static void main(String[] args) {
		OptionalInt optionalComValor = OptionalInt.of(5);
		OptionalInt optionalVazio = OptionalInt.empty();
		
		if (optionalComValor.isPresent()) {
			System.out.println(optionalComValor.getAsInt());
		}
		if (optionalVazio.isPresent()) {
			System.out.println(optionalVazio.getAsInt());
		}
	}

}
