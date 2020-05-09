package br.com.interfacefuncionais;

@FunctionalInterface
interface Executavel2 {

	void execute(); // método funcional
	
	// métodos adicionais static são permitidos
	static void execute(Executavel2... executaveis) {
		for (Executavel2 executavel : executaveis) {
			executavel.execute();
		}
	}

	// métodos adicionais default são permitidos
	default void executeDuasVezes() {
		execute();
		execute();
	}

}
