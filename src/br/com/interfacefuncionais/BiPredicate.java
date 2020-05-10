package br.com.interfacefuncionais;

//BiPredicate � uma interface funcional que recebe dois par�metros de entrada e retorna um valor booleano.

@FunctionalInterface
public interface BiPredicate<T, U> {
	boolean test(T t, U u);
}
