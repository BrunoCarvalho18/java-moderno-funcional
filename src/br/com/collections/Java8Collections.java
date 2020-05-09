package br.com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java8Collections {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		lista.forEach(n -> System.out.println("forEach: " + n));
		lista.removeIf(n -> n % 2 == 0);
		lista.forEach(n -> System.out.println("forEach 2: " + n));
		lista.replaceAll(n -> n * 2);
		lista.forEach(n -> System.out.println(n));

		//Mapa
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "Se");
		map.put(1, "inscreva");
		map.put(2, "no");
		map.put(3, "canal");
		
		// forEach
		map.forEach((k,v) -> System.out.println(k+v));
		
		//compute
		map.compute(1, (k,v) -> v + "agora");
		map.forEach((k,v) -> System.out.println(k+v));
		
		//merge
		map.merge(3, "!",(v1,v2)->v1+v2);
		map.forEach((k,v) -> System.out.println(k+v));
		
		//replaceAll
		map.replaceAll((k,v)->v+"!");
		map.forEach((k,v) -> System.out.println(k+v));

	}

}
