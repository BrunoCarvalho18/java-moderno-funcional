package br.com.interfacefuncionais;

//UnaryOperator é uma interface funcional que recebe um parâmetro de entrada e retorna um valor do mesmo tipo da entrada
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {

}
