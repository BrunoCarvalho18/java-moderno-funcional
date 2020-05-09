package br.com.metodoslambdarunners;

public class Java8LambdaRunnable {

	public static void main(String[] args) {

		// JAVA 8: FUN��ES LAMBDA
		// A Interface tem o um �nica interface abstrata
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Ol� mundo sem Java 8");
			}}).run();
		
		new Thread(()->System.out.println("Ol� mundo com Java 8")).run();

	}

}
