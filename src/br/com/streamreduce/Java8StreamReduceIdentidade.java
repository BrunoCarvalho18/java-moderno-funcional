package br.com.streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Java8StreamReduceIdentidade {

	public static void main(String[] args) {
		String s = "Increva-se no canal e compartilhe esse vídeo";
		String[] split = s.split(" ");
		List<String> listStr = Arrays.asList(split);
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

		lista.stream().forEach(System.out::println);

		// reduce - soma--> soma todos os números do array
		Integer soma = lista.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("usando o reduce com soma: " + soma);

		// reduce - multiplicação--> multiplica todos os números do array
		Integer multiplicacao = lista.stream().reduce(1, (n1, n2) -> n1 * n2);
		System.out.println("usando o reduce com mult: " + multiplicacao);

		// reduce - subtração
		Integer subt = lista.stream().reduce(0, (n1, n2) -> n1 - n2);
		System.out.println("usando o reduce com subt: " + subt);

		// reduce - concatenação
		String concatenacao = listStr.stream().reduce("", (s1, s2) -> s1.concat(s2));
		System.out.println("usando a concatenacao: " + concatenacao);

		// reduce - menor valor
		OptionalDouble reduce = DoubleStream.of(1.0, 1.5, 2.9, 6.7).reduce((d1, d2) -> Math.min(d1, d2));

		System.out.println("vendo qual o menor número:" + reduce);

		double positiveInfinity = DoubleStream.of(1.0, 1.5, 2.9, 6.7).reduce(Double.POSITIVE_INFINITY,(d1, d2) -> Math.min(d1, d2));

		System.out.println("vendo qual o menor número positivy Infinity:" + positiveInfinity);
		
		// função de combinação
		Integer soma3 = lista.stream()
				.reduce(0, (n1,n2) -> n1 + n2,(n1,n2) -> n1 + n2);
		
		System.out.println(soma3);
		
		//reduce map+ combiner
		Optional<String> reduce2 = lista.stream()
				.map(n1->n1.toString())
				.reduce((n1,n2)-> n1.concat(n2));
		
		System.out.println("reduce + map + combiner: "+ reduce2);
		

	}

}
