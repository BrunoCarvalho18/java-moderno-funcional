package br.com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsListStream {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C");
		list.stream().forEach(System.out::println);
	}

}
