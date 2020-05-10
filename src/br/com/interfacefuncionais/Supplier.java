package br.com.interfacefuncionais;

//Supplier � uma interface funcional que n�o recebe nenhum par�metro de entrada, mas retorna um valor

@FunctionalInterface
public interface Supplier<T> {

	T get();

}


