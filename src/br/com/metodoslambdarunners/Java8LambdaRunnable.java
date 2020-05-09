package br.com.metodoslambdarunners;

public class Java8LambdaRunnable {

	public static void main(String[] args) {

		// JAVA 8: FUNÇÕES LAMBDA
		// A Interface tem o um única interface abstrata
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Olá mundo sem Java 8");
			}}).run();
		
		new Thread(()->System.out.println("Olá mundo com Java 8")).run();

	}

}
