package br.com.interfacefuncionais;

@FunctionalInterface // Anota��o n�o � obrigat�ria
interface Executaval {

	void execute();

	// sobrescrevendo m�todos de Object
	@Override
	String toString();

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();
}
