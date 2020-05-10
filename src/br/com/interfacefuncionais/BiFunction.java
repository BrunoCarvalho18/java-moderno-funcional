package br.com.interfacefuncionais;

//BiFunction � uma interface funcional que recebe dois par�metros de entrada e retorna um valor

public interface BiFunction<T, U, R> {
	R apply(T t, U u);
}
