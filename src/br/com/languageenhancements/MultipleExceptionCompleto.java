package br.com.languageenhancements;

//Multipla exceção
public class MultipleExceptionCompleto {

	public static void main(String[] args) {

		try {
			throw new NullPointerException();
		} catch (NullPointerException | IllegalArgumentException | IllegalStateException e) {
			System.out.println("Exceção capturada: " + e);
		} catch (Exception e) {
			System.out.println("Exceção capturada: " + e);
		}

	}

}
