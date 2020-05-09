package br.com.streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8StreamReduce {

	//Reduce � imut�vel
	public static void main(String[] args) {
		String s = "Increva-se no canal e compartilhe esse v�deo";
		String[] split = s.split(" ");
		List<String> listStr = Arrays.asList(split);
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

		lista.stream().forEach(System.out::println);

		// reduce - soma--> soma todos os n�meros do array
		Optional<Integer> soma = lista.stream().reduce((n1, n2) -> n1 + n2);
        System.out.println("usando o reduce com soma: " + soma.get());

		// reduce - multiplica��o--> multiplica todos os n�meros do array
		Optional<Integer> multiplicacao = lista.stream().reduce((n1, n2) -> n1 * n2);
        System.out.println("usando o reduce com mult: " + multiplicacao.get());

		// reduce - subtra��o ---> N�O FA�A
		Optional<Integer> subt = lista.stream().reduce((n1, n2) -> n1 - n2);
        System.out.println("usando o reduce com subt: " + subt.get());

		// reduce - concatena��o
		Optional<String> concatenacao = listStr.stream().reduce((s1, s2) -> s1.concat(s2));
        System.out.println("usando a concatenacao: " + concatenacao);

	}

}
