package br.com.interfacefuncionais;

//Predicate � uma interface funcional que recebe um par�metro de entrada e retorna um valor booleano.

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
