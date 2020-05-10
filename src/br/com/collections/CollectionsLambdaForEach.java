package br.com.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionsLambdaForEach {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 6, 7, 2, 9);
		list.forEach(System.out::println);
	}

}
