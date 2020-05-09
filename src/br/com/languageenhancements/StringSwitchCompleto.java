package br.com.languageenhancements;

public class StringSwitchCompleto {

	public static void main(String[] args) {

		/*
		 * Se estiver dois janeiros ele não compila 
		 * case "jan":
		 * System.out.println("Janeiro"); 
		 * break; 
		 * case "jan": // NÃO COMPILA - Já existe o case "jan"
		 * System.out.println("Janeiro2"); 
		 * break;
		 * default: // COMPILA - O default pode estar em qualquer posição
         * break;
		 */

		String mes = "jan";

		switch (mes) {
		case "jan":
			System.out.println("Janeiro");
			break;
		default:
			break; // COMPILA O default pode estar em qualquer posição
		case "mar":
			System.out.println("Março");
			break;
		}

	}

}
