package br.com.interfacefuncionais;

import java.time.LocalDate;
import java.time.LocalTime;

public class BuiltInterfacesConsumerExemplo {

	public static void main(String[] args) {
		Consumer<Object> impressor = x -> System.out.println(x);
		impressor.accept(LocalDate.now()); // imprimirá a data atual
		
		// BiConsumer
		BiConsumer<Object, Object> impressor2 = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		impressor2.accept(LocalDate.now(), LocalTime.now()); // imprimirá a data atual e depois a hora atual
		
	}

}
