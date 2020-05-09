package br.com.optional;

import java.util.Optional;

public class Java8OptionalofNullable {

	public static void main(String[] args) {

		String s = "Inscreva-se no canal";
		Optional<Integer> numero = converteEmNumero(s);
		System.out.println(numero);
     }

	public static Optional<Integer> converteEmNumero(String numeroStr) {
		return Optional.ofNullable(null);
     }

}
