package br.com.interfacefuncionais;

@FunctionalInterface // Anotação não é obrigatória
interface Executaval {

	void execute();

	// sobrescrevendo métodos de Object
	@Override
	String toString();

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();
}
