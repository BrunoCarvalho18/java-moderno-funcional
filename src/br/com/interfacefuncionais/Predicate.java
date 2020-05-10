package br.com.interfacefuncionais;

//Predicate é uma interface funcional que recebe um parâmetro de entrada e retorna um valor booleano.

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
