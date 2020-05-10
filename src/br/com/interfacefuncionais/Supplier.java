package br.com.interfacefuncionais;

//Supplier é uma interface funcional que não recebe nenhum parâmetro de entrada, mas retorna um valor

@FunctionalInterface
public interface Supplier<T> {

	T get();

}


