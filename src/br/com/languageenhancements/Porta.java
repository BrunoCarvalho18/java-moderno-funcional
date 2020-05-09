package br.com.languageenhancements;

public class Porta implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// chamado automaticamente pelo try-withresources
		System.out.println("Porta fechada.");
      }

}
