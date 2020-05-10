package br.com.interfacefuncionais;

import java.time.LocalDate;

public class BuiltInterfacesSupplierExemplo {

	public static void main(String[] args) {
		Supplier<LocalDate> supplier = () -> LocalDate.now();
		System.out.println(supplier.get()); // imprimirá a data atual
	}

}
