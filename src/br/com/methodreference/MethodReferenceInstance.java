package br.com.methodreference;

import java.util.function.BiFunction;

public class MethodReferenceInstance {

	static class Conversor {
		public String converte(Integer x, Integer y) {
			return String.valueOf(x) + " - - " + String.valueOf(y);
		}
	}

	public static void main(String[] args) {

		Conversor conversor = new Conversor(); // inst�ncia da classe Conversor
		// representa��o com express�o lambda
		BiFunction<Integer, Integer, String> converte1 = (x, y) -> conversor.converte(x, y);
		// representa��o com refer�ncia ao m�todo da inst�ncia
		BiFunction<Integer, Integer, String> converte2 = conversor::converte; // m�todo inference
		// os resultados ser�o iguais
		System.out.println(converte1.apply(5, 8));
		System.out.println(converte2.apply(5, 8));

	}

}
