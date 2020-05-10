package br.com.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyCopyOnWriteArrayList {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		for (String string : list) {
			System.out.println(string);
			if (string.equals("A")) {
				list.add("D");
			}
		}
		System.out.println("Lista final: " + list);

	}

}
