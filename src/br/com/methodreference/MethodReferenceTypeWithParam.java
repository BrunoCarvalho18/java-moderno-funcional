package br.com.methodreference;

import java.util.function.BiFunction;

public class MethodReferenceTypeWithParam {

	public static void main(String[] args) {
		// representa��o com express�o lambda
		BiFunction<Integer, Integer, Integer> comparador1 = (x, y) -> x.compareTo(y);
		
		// representa��o com refer�ncia ao m�todo compareTo do tipo Integer (que recebe um par�metro)
		BiFunction<Integer, Integer, Integer> comparador2 = Integer::compareTo;

		System.out.println(comparador1.apply(1, 2));
		System.out.println(comparador2.apply(1, 2));

	}

}
