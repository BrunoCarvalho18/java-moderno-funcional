package br.com.interfacefuncionais;

//BinaryOperator é uma interface funcional que recebe dois parâmetros de entrada do mesmo tipo, e retorna um valor do mesmo tipo das entradas.

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T> {

}
