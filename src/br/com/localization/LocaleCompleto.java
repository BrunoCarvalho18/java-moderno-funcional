package br.com.localization;

import java.util.Locale;

public class LocaleCompleto {

	public static void main(String[] args) {
		System.out.println(" - Constantes - ");
		System.out.println(Locale.CANADA);
		System.out.println(Locale.UK);
		System.out.println(" - Construtor - ");
		System.out.println(new Locale("pt", "BR"));
		System.out.println(new Locale("pt", "PT"));
		System.out.println(new Locale("ca", "ES", "VALENCIA"));
		System.out.println(" - Language Tags - ");
		System.out.println(Locale.forLanguageTag("en-CA"));
		System.out.println(Locale.forLanguageTag("pt-BR"));
		System.out.println(Locale.forLanguageTag("pt-PT"));
		System.out.println(Locale.forLanguageTag("ca-ES"));
		System.out.println(Locale.forLanguageTag("gsw-u-sd-chzh"));
		System.out.println(" - Builder - ");

		Locale locale1 = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
		System.out.println(locale1);
		Locale locale2 = new Locale.Builder().setLanguage("az").setRegion("AZ").setScript("Latn").build();
		System.out.println(locale2);
		Locale locale3 = new Locale.Builder().setLanguage("bs").setRegion("BA").setVariant("POSIX").setScript("Latn")
				.setExtension('c', "cc").build();
		System.out.println(locale3);
	}

}
