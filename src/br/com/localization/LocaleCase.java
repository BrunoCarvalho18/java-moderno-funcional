package br.com.localization;

import java.util.Locale;

public class LocaleCase {
	
	public static void main(String[] args) {
		System.out.println(new Locale("PT", "br"));
		
		System.out.println(Locale.forLanguageTag("PT-br"));
		
		Locale localePtBR = new Locale.Builder()
		.setLanguage("PT")
		.setRegion("br")
		.build();
		System.out.println(localePtBR);
	}

}
