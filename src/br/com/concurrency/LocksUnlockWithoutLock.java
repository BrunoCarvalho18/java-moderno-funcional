package br.com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksUnlockWithoutLock {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		try {
			System.out.println("ABC");
		} finally {
			lock.unlock(); // lança exceção, pois não há lock
		}

	}

}
