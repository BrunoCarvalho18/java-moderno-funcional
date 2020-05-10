package br.com.interfacefuncionais;

public class BuiltInterfacesFunctionExemplo {

	public static void main(String[] args) {
		Function<Integer, Double> duplica = x -> x * 2.5;
		System.out.println(duplica.apply(3)); // multiplica 3 * 2.5
		
		BiFunction<Integer, Integer, Double> multiplicaEDuplica = (x, y) -> x * y * 2.5;
		System.out.println(multiplicaEDuplica.apply(3, 4)); // multiplica 3 * 4 * 2.5

	}

}
