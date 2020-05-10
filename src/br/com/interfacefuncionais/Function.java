package br.com.interfacefuncionais;

//Function é uma interface funcional que recebe um parâmetro de entrada e retorna um valor.

@FunctionalInterface
public interface Function<T,R> {
	R apply(T t);
}
