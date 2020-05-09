package br.com.localization;

import java.util.Locale;

public class LocaleInstantiation {
	
	public static void main(String[] args) {
		new Locale("pt", "BR"); // pt-BR com Construtor
		
		Locale.forLanguageTag("pt-BR"); // pt-BR com LanguageTag
		
		Locale localePtBR = new Locale.Builder() // pt-BR com Builder
		.setLanguage("pt")
		.setRegion("BR")
		.build();
		
		System.out.println(localePtBR);
	}

}
