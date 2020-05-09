package br.com.languageenhancements;

public class StringInSwitchBreak {

	public static void main(String[] args) {

		String mes = "jan";

		switch (mes) {
		case "jan":
			System.out.println("Janeiro");
		default:
			System.out.println("Não é um mês"); // Executa Não é um mês pois não tem break
		case "fev":
			System.out.println("Fevereiro");
			break;
		case "mar":
			System.out.println("Março");
			break;
		}
	}

}
