package br.com.methodreference;

import java.util.function.BiFunction;

public class MethodReferenceTypeWithParam {

	public static void main(String[] args) {
		// representação com expressão lambda
		BiFunction<Integer, Integer, Integer> comparador1 = (x, y) -> x.compareTo(y);
		
		// representação com referência ao método compareTo do tipo Integer (que recebe um parâmetro)
		BiFunction<Integer, Integer, Integer> comparador2 = Integer::compareTo;

		System.out.println(comparador1.apply(1, 2));
		System.out.println(comparador2.apply(1, 2));

	}

}
