package br.com.optional;

import java.util.Optional;

public class BuiltInInterfacesOptionalIfPresent {

	public static void main(String[] args) {
		Optional<String> optionalVazio = Optional.empty();
		Optional<String> optionalComValor = Optional.of("valor");
		// A linha abaixo n�o ir� imprimir nada, pois o optional est� vazio
		optionalVazio.ifPresent(valor -> System.out.println("Vazio: " + valor));
		// A linha abaixo ir� imprimir, pois o optional possui valor
		optionalComValor.ifPresent(valor -> System.out.println("Com Valor: " + valor));
	}

}
