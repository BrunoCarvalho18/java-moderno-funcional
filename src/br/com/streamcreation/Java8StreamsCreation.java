package br.com.streamcreation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8StreamsCreation {
	
	public static void main(String[] args) {
		
		//Collection
		List<Integer> lista = Arrays.asList(1,2,3,4);
		lista.stream().forEach(System.out::println);
		
		//Array
		Integer[] intArray = new Integer[] {1,2,3,4};
		Arrays.stream(intArray).forEach(System.out::println);
		
		//Stream of
		Stream
		.of("Se","inscreva","no","canal","!")
		.forEach(System.out::println);
		
		//IntStream range
		IntStream.range(0,5).forEach(System.out::println);
		
	    //IntStream range closed 0-->5
		IntStream.rangeClosed(0,5).forEach(System.out::println);
		
		//Stream iterate
		Stream.iterate(5, n -> n * 2)
		 .limit(10)
		.forEach(System.out::println);
		
		//Random
		new Random().ints()
		.limit(10)
		.forEach(System.out::println);
		
		// Pattern
		
		String s ="Deixar um curtir no vídeo!";
		Pattern pa = Pattern.compile(" ");
		pa.splitAsStream(s).forEach(System.out::println);
		
		
	}

}
