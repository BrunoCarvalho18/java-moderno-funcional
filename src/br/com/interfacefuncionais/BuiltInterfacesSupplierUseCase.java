package br.com.interfacefuncionais;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BuiltInterfacesSupplierUseCase {

	public static String valideIdade(int idade, Supplier<String> supplier) {
		if (idade < 18) {
			return "Menor de idade!";
		} else {
			return "Maior de idade! Validação realizada às " + supplier.get();
		}

	}

	public static void main(String[] args) {
		Supplier<String> supplier = () -> LocalDate.now().atTime(LocalTime.now()).format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(valideIdade(17, supplier));
		System.out.println(valideIdade(18, supplier));
		System.out.println(valideIdade(25, supplier));
	}

}
