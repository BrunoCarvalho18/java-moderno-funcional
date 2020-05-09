package br.com.metodosdefaultinterfaces;

interface Corredor {
	
	abstract void correr();
	default void correrRapido() {
		System.out.println("Correndo...");
	}

}
