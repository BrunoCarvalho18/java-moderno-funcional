package br.com.languageenhancements;

//Multipla exce��o
public class MultipleExceptionCompleto {

	public static void main(String[] args) {

		try {
			throw new NullPointerException();
		} catch (NullPointerException | IllegalArgumentException | IllegalStateException e) {
			System.out.println("Exce��o capturada: " + e);
		} catch (Exception e) {
			System.out.println("Exce��o capturada: " + e);
		}

	}

}
