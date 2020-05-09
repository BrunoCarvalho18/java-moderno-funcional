package br.com.languageenhancements;

public class TryWithResourcesOrder {

	public static void main(String[] args) throws Exception {
		try (Porta porta = new Porta(); 
				Gaveta gaveta = new Gaveta()) {
			System.out.println("Olá.");
		}
	}

}
