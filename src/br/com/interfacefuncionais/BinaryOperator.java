package br.com.interfacefuncionais;

//BinaryOperator � uma interface funcional que recebe dois par�metros de entrada do mesmo tipo, e retorna um valor do mesmo tipo das entradas.

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T> {

}
