package br.com.interfacefuncionais;

//BiConsumer é uma interface funcional que recebe dois parâmetros de entrada, e não retorna nenhum valor.

@FunctionalInterface
interface BiConsumer<T, U> {
	
	void accept(T t, U u);
}

