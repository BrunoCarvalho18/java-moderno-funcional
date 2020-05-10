package br.com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TasksSingleThreadManyTasks {

	public static void main(String[] args) {
		ExecutorService executor = null;
		try {
			executor = Executors.newSingleThreadExecutor(); // executor com uma única thread
			executor.execute(
					() -> System.out.println("Tarefa 1 - Thread do Executor: " + Thread.currentThread().getName()));
			executor.execute(
					() -> System.out.println("Tarefa 2 - Thread do Executor: " + Thread.currentThread().getName()));
			executor.execute(
					() -> System.out.println("Tarefa 3 - Thread do Executor: " + Thread.currentThread().getName()));
			System.out.println("Thread Principal: " + Thread.currentThread().getName());
		} finally {
			if (executor != null) {
				executor.shutdown();
			}
		}

	}

}
