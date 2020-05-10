package br.com.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ConcurrencyCyclicBarrier {

	static class Acao implements Runnable {
		CyclicBarrier cyclicBarrier;

		public Acao(CyclicBarrier cyclicBarrier) {
			this.cyclicBarrier = cyclicBarrier;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + ": Primeira Parte");
			try {
				cyclicBarrier.await(); // sincronização das threads
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": Segunda Parte");
			try {
				cyclicBarrier.await(); // sincronização das threads
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": Terceira Parte");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criação de um CyclicBarrier para 3 threads
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		// Criação das threads
		Thread thread1 = new Thread(new Acao(cyclicBarrier));
		Thread thread2 = new Thread(new Acao(cyclicBarrier));
		Thread thread3 = new Thread(new Acao(cyclicBarrier));
		// Início de execução das threads
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
