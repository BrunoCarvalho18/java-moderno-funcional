package br.com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TasksSingleThreadSubmit {

	public static void main(String[] args) {
		ExecutorService executor = null;
		try {
			executor = Executors.newSingleThreadExecutor();
			Future<?> tarefa = executor
					.submit(() -> System.out.println("Thread do Executor:" + Thread.currentThread().getName()));
			System.out.println("Tarefa já finalizada? " + tarefa.isDone());
			System.out.println("Tarefa já finalizada? " + tarefa.isDone());
			System.out.println("Tarefa já finalizada? " + tarefa.isDone());
			System.out.println("Tarefa já finalizada? " + tarefa.isDone());
		} finally {
			if (executor != null) {
				executor.shutdown();
			}
		}

	}

}
