package br.com.metodoslambdarunners;

import java.util.Arrays;
import java.util.List;

public class Java8LambdaStream {
	
	public static void main(String[] args) {
		
		//JAVA 8: Funções Lambda
		
		//API DE STREAM
		
		//stream - fluxo de dados
		
		List<Integer> asList = Arrays.asList(1,2,3,4);
		
		for(Integer integer: asList) {
			System.out.println(integer);
		}
		
		asList.stream()
		          .filter(e-> e % 2==0)
		          .forEach(e-> System.out.println("Stream de: "+e));
	}

}
