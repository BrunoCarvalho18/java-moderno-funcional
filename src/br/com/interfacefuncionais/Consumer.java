package br.com.interfacefuncionais;

//Existem interfaces DoubleConsumer, IntConsumer,LongConsumer, ObjDoubleConsumer, ObjIntConsumer e ObjLongConsumer.
//Consumer é uma interface funcional que recebe um parâmetro de entrada, e não retorna nenhum valor

@FunctionalInterface
public interface Consumer<T> {
	
	void accept(T t);

}
