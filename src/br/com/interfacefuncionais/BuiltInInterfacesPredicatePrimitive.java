package br.com.interfacefuncionais;

import java.util.Random;
import java.util.function.IntPredicate;

public class BuiltInInterfacesPredicatePrimitive {
	
	public static void main(String[] args) {
		IntPredicate dado = x -> x == new Random().nextInt(7);
		System.out.println(dado.test(1)); // testa se o número gerado é igual a 1
	}

}
