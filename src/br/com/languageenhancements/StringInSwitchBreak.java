package br.com.languageenhancements;

public class StringInSwitchBreak {

	public static void main(String[] args) {

		String mes = "jan";

		switch (mes) {
		case "jan":
			System.out.println("Janeiro");
		default:
			System.out.println("N�o � um m�s"); // Executa N�o � um m�s pois n�o tem break
		case "fev":
			System.out.println("Fevereiro");
			break;
		case "mar":
			System.out.println("Mar�o");
			break;
		}
	}

}
