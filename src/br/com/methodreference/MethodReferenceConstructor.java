package br.com.methodreference;

import java.util.function.Function;

public class MethodReferenceConstructor {

	public static void main(String[] args) {
		
		// representa��o com express�o lambda
		Function<String, Integer> stringParaInteger1 = s -> new Integer(s);
		// representa��o com refer�ncia ao construtor
		Function<String, Integer> stringParaInteger2 = Integer::new; //m�todo com refer�ncia
		
		// os resultados ser�o iguais
		System.out.println(stringParaInteger1.apply("1"));
		System.out.println(stringParaInteger2.apply("1"));

	}

}
