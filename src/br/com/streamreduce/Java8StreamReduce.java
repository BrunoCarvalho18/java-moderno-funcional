package br.com.streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8StreamReduce {

	//Reduce é imutável
	public static void main(String[] args) {
		String s = "Increva-se no canal e compartilhe esse vídeo";
		String[] split = s.split(" ");
		List<String> listStr = Arrays.asList(split);
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

		lista.stream().forEach(System.out::println);

		// reduce - soma--> soma todos os números do array
		Optional<Integer> soma = lista.stream().reduce((n1, n2) -> n1 + n2);
        System.out.println("usando o reduce com soma: " + soma.get());

		// reduce - multiplicação--> multiplica todos os números do array
		Optional<Integer> multiplicacao = lista.stream().reduce((n1, n2) -> n1 * n2);
        System.out.println("usando o reduce com mult: " + multiplicacao.get());

		// reduce - subtração ---> NÃO FAÇA
		Optional<Integer> subt = lista.stream().reduce((n1, n2) -> n1 - n2);
        System.out.println("usando o reduce com subt: " + subt.get());

		// reduce - concatenação
		Optional<String> concatenacao = listStr.stream().reduce((s1, s2) -> s1.concat(s2));
        System.out.println("usando a concatenacao: " + concatenacao);

	}

}
