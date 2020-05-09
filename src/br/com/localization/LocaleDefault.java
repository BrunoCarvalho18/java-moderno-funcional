package br.com.localization;

import java.util.Locale;

public class LocaleDefault {
	
	public static void main(String[] args) {
		System.out.println(Locale.getDefault()); // o padrão inicial muda de acordo com seu dispositivo
		Locale.setDefault(Locale.KOREA); // altera o Locale default
		System.out.println(Locale.getDefault()); // ko_KR
	}

}
