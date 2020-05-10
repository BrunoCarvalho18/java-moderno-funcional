package br.com.interfacefuncionais;

//Existem interfaces DoubleConsumer, IntConsumer,LongConsumer, ObjDoubleConsumer, ObjIntConsumer e ObjLongConsumer.
//Consumer � uma interface funcional que recebe um par�metro de entrada, e n�o retorna nenhum valor

@FunctionalInterface
public interface Consumer<T> {
	
	void accept(T t);

}
