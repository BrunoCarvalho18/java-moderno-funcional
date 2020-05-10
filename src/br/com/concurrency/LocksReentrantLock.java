package br.com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksReentrantLock {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		try {
			lock.lock(); // apenas uma thread obtém o lock por vez
			System.out.println("ABC");
		} finally {
			lock.unlock(); // desfaz o lock
		}

	}

}
