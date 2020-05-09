package br.com.interfacefuncionais;

@FunctionalInterface
interface Executavel2 {

	void execute(); // m�todo funcional
	
	// m�todos adicionais static s�o permitidos
	static void execute(Executavel2... executaveis) {
		for (Executavel2 executavel : executaveis) {
			executavel.execute();
		}
	}

	// m�todos adicionais default s�o permitidos
	default void executeDuasVezes() {
		execute();
		execute();
	}

}
