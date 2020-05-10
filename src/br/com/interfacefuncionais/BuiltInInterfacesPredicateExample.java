package br.com.interfacefuncionais;

import java.util.Random;

public class BuiltInInterfacesPredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> dado = x -> x.equals(new Random().nextInt(7));
		System.out.println(dado.test(1)); // testa se o número gerado é igual a 1
		BiPredicate<Integer, Integer> dadoDuplo = (x, y) -> x.equals(new Random().nextInt(7)) || y.equals(new Random().nextInt(7));
		System.out.println(dadoDuplo.test(1, 2)); // testa se o primeiro número gerado é igual a 1
		// ou se o segundo número gerado é igual a 2
	}

}
