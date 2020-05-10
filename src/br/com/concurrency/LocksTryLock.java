package br.com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksTryLock {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		boolean temLock = lock.tryLock();
		if (temLock) {
			try {
				System.out.println("ABC");
			} finally {
				lock.unlock(); // desfaz o lock
			}
		} else {
			System.out.println("DEF");
		}

	}

}
