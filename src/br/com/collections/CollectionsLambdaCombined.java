package br.com.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionsLambdaCombined {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 6, 7, 2, 9, 54, 13, 87, 23, 97, 34, 17, 34, 89, 35, 26);
		list.stream()
		.sorted()
		.filter(n -> n > 10)
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
	}

}
