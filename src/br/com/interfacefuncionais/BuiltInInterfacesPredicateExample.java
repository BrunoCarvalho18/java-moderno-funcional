package br.com.interfacefuncionais;

import java.util.Random;

public class BuiltInInterfacesPredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> dado = x -> x.equals(new Random().nextInt(7));
		System.out.println(dado.test(1)); // testa se o n�mero gerado � igual a 1
		BiPredicate<Integer, Integer> dadoDuplo = (x, y) -> x.equals(new Random().nextInt(7)) || y.equals(new Random().nextInt(7));
		System.out.println(dadoDuplo.test(1, 2)); // testa se o primeiro n�mero gerado � igual a 1
		// ou se o segundo n�mero gerado � igual a 2
	}

}
