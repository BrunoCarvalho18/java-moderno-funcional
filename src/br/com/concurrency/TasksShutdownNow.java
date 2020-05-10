package br.com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TasksShutdownNow {

	public static void main(String[] args) {
		ExecutorService executor = null;
		try {
			executor = Executors.newSingleThreadExecutor();
			executor.execute(() -> System.out.println("Thread do Executor: " + Thread.currentThread().getName()));
			System.out.println("Thread Principal: " + Thread.currentThread().getName());
		} finally {
			if (executor != null) {
				executor.shutdownNow(); // TENTA encerrar todas as threads imediatamente
			}
		}

	}

}
