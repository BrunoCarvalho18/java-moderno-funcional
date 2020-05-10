package br.com.interfacefuncionais;

//BiFunction é uma interface funcional que recebe dois parâmetros de entrada e retorna um valor

public interface BiFunction<T, U, R> {
	R apply(T t, U u);
}
