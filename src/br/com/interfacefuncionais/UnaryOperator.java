package br.com.interfacefuncionais;

//UnaryOperator � uma interface funcional que recebe um par�metro de entrada e retorna um valor do mesmo tipo da entrada
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {

}
