package br.com.optional;

import java.util.Optional;

public class BuiltInInterfacesOptionalNullable {
	
	public static void main(String[] args) {
		// Exemplo tentando utilizar .of e passando 'null' como argumento
		try {
		Optional.of(null); // Lan�a NullPointerException nesta linha
		} catch (Exception e) {
		e.printStackTrace();
		}
		// Exemplo utilizando o m�todo correto: .ofNullable
		Optional<String> ofNullable = Optional.ofNullable(null); // Cria um Optional vazio
		System.out.println(ofNullable.isPresent()); // Imprime 'false' pois n�o possui valor
	}

}
