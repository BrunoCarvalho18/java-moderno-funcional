package br.com.languageenhancements;

public class StringSwitchCompleto {

	public static void main(String[] args) {

		/*
		 * Se estiver dois janeiros ele n�o compila 
		 * case "jan":
		 * System.out.println("Janeiro"); 
		 * break; 
		 * case "jan": // N�O COMPILA - J� existe o case "jan"
		 * System.out.println("Janeiro2"); 
		 * break;
		 * default: // COMPILA - O default pode estar em qualquer posi��o
         * break;
		 */

		String mes = "jan";

		switch (mes) {
		case "jan":
			System.out.println("Janeiro");
			break;
		default:
			break; // COMPILA O default pode estar em qualquer posi��o
		case "mar":
			System.out.println("Mar�o");
			break;
		}

	}

}
