package br.com.metodosdefaultinterfaces;

public class Pessoa implements Corredor {

	@Override
	public void correr() {
		System.out.println("Pessoa Correndo");
	}
	
	@Override
	public void correrRapido() {
		System.out.println("Correndo mais rápido ainda");
	}

}
