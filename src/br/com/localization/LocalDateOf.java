package br.com.localization;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateOf {

	public static void main(String[] args) {
		System.out.println(LocalDate.of(2019, 5, 20));
		System.out.println(LocalDate.of(2019, Month.MAY, 20));
	}

}
