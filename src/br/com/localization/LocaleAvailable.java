package br.com.localization;

import java.util.Locale;

public class LocaleAvailable {

	public static void main(String[] args) {
		Locale[] availableLocales = Locale.getAvailableLocales();
		// imprime o 10 primeiros Locales dispon�veis
		for (int i = 0; i < 10; i++) {
			System.out.println(availableLocales[i]);
		}
	}
}
