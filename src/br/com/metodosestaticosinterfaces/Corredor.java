package br.com.metodosestaticosinterfaces;

public interface Corredor {

	//M�todos que v�o ser �teis
	static double calcularVelocidade(double d, double t) {
		return d / t;
	}

}
