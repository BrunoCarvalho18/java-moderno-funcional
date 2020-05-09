package br.com.languageenhancements;

public class Gaveta implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Gaveta fechada."); // chamado automaticamente pelo try-with-resources
	}

}
