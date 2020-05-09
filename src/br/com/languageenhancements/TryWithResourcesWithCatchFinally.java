package br.com.languageenhancements;

import java.io.FileNotFoundException;

public class TryWithResourcesWithCatchFinally {

	public static void main(String[] args) throws FileNotFoundException {
		try (Porta porta = new Porta()) { // Porta instanciada dentro da instrução trywith-resources
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}

}
