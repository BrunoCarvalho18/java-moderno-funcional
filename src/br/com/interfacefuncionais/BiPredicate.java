package br.com.interfacefuncionais;

//BiPredicate é uma interface funcional que recebe dois parâmetros de entrada e retorna um valor booleano.

@FunctionalInterface
public interface BiPredicate<T, U> {
	boolean test(T t, U u);
}
