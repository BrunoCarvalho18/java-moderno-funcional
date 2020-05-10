package br.com.optional;

import java.util.Optional;

public class BuiltInInterfacesOptionalCreation {

	// Exemplo de método sem Optional
	private static String recupereNomeMes(int mes) {
		if (mes == 1) {
			return "Janeiro";
	    		
		} else if(mes==2){
			return "Fevereiro";
		}
		else {
			return null;
		}
	}

	// Exemplo de método retornando Optional
	private static Optional<String> recupereNomeMesOptional(int mes) {
		if (mes == 1) {
			return Optional.of("Janeiro"); // cria Optional com valor
		} else {
			return Optional.empty(); // cria Optional vazio
		}
	}

	public static void main(String[] args) {
		String nomeMes1 = recupereNomeMes(1);
		if (nomeMes1 != null) { 
			System.out.println(nomeMes1);
		}

		Optional<String> nomeMes2 = recupereNomeMesOptional(1);
		if (nomeMes2.isPresent()) { // valida se o Optional possui um valor preenchido
			System.out.println(nomeMes2.get()); // recupera o valor dentro do Optional
		}

	}
}