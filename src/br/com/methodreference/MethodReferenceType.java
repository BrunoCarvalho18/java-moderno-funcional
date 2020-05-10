package br.com.methodreference;

import java.util.function.Function;

public class MethodReferenceType {
	
	public static void main(String[] args) {
		
		// representa��o com express�o lambda
		Function<Integer, Double> intParaDouble1 = x -> x.doubleValue();
		// representa��o com refer�ncia ao m�todo doubleValue
		Function<Integer, Double> intParaDouble2 = Integer::doubleValue;
		// os resultados ser�o iguais
		System.out.println(intParaDouble1.apply(8));
		System.out.println(intParaDouble2.apply(8));
		
	}

}
