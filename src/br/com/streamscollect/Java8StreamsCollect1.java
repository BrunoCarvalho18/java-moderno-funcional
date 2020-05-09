package br.com.streamscollect;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Colector é mutável
public class Java8StreamsCollect1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// fornecedor - acumulação - combinação

		Set<Integer> collect = list.stream().collect(() -> new HashSet<>(), (l, e) -> l.add(e),
				(l1, l2) -> l1.addAll(l2));

		System.out.println(list);
		System.out.println(collect);

		// toList com números diviseis por 2
		List<Integer> collect2 = list.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("collectors com tolist com números diviseis por 2: " + collect2);

		// toList com números diviseis por 3
		List<Integer> collect3 = list.stream().filter((n) -> n % 3 == 0).collect(Collectors.toList());
        System.out.println("collectors com tolist com números diviseis por 3: " + collect3);

		// toSet com números diviseis por 2 set
		Set<Integer> collect4 = list.stream().filter((n) -> n % 2 == 0).collect(Collectors.toSet());
        System.out.println("collectors com tolist com números diviseis por 2 set: " + collect4);

		// toSet com números diviseis por 2 set
		Set<Integer> collect5 = list.stream().filter((n) -> n % 2 == 0)
				.collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println("collectors com tolist com números diviseis por 2 set: " + collect5);

		// toSet com números diviseis por 2 set
		Deque<Integer> collect6 = list.stream().filter((n) -> n % 2 == 0)
				.collect(Collectors.toCollection(() -> new ArrayDeque<Integer>()));
        System.out.println("collectors com tolist com números diviseis por 2 deque: " + collect6);

		// Joining juntar com os números
		String join = list.stream().map(n -> n.toString()).collect(Collectors.joining("f"));
		System.out.println("juntar número com f: " + join);

		// averaging
		Double media = list.stream().collect(Collectors.averagingInt(n -> n.intValue()));
        System.out.println("média averaging: " + media);

		// summing
		Integer summing = list.stream().collect(Collectors.summingInt(n -> n.intValue()));
        System.out.println("soma summing: " + summing);

		// sumarizing
		IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(n -> n.intValue()));
		System.out.println("IntSummarizingStatistics: ");
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMax());
		System.out.println(stats.getSum());

		// couting --> contando os números que são divísiveis por 2
		Long count = list.stream().filter((n) -> n % 2 == 0).collect(Collectors.counting());

		System.out.println("contando os números: " + count);

		// max/min --> retornará o maior valor divisivel por 8
		Optional<Integer> max = list.stream().filter((n) -> n % 2 == 0).collect(Collectors.maxBy
				(Comparator.naturalOrder()));

		System.out.println("contando os números Max: " + max);
		
		//groupinBy
		Map<Integer,List<Integer>> collect7 =list.stream().collect(Collectors.groupingBy((n)->n % 3));
		System.out.println("groupinBy: "+collect7);
		
		//partitioningBy
		Map<Boolean,List<Integer>> collect8 =list.stream().collect(Collectors.partitioningBy((n)->n % 3==0));
		System.out.println("partitioningBy: "+collect8);
		
		//toMap --> O número 1 é chave 2 é o valor
		Map<Integer,Integer> toMap = list.stream().collect(Collectors.toMap(n -> n,n -> n * 2));
		System.out.println("toMap: "+toMap);
		
		

	}

}
