package br.com.interfacefuncionais;

//BiConsumer � uma interface funcional que recebe dois par�metros de entrada, e n�o retorna nenhum valor.

@FunctionalInterface
interface BiConsumer<T, U> {
	
	void accept(T t, U u);
}

