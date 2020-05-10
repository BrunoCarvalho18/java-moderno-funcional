package br.com.interfacefuncionais;

//Function � uma interface funcional que recebe um par�metro de entrada e retorna um valor.

@FunctionalInterface
public interface Function<T,R> {
	R apply(T t);
}
