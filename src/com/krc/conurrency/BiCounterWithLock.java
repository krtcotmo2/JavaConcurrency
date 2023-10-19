package com.krc.conurrency;
import java.util.concurrent.locks.*;

public class BiCounterWithLock {
	private int counterA = 0;
	private int counterB = 0;
	// Locks allow for different threads to access different methods
	// at the same time. If they need to access the same method,
	// the queue process starts.
	 Lock lockA = new ReentrantLock();
	 Lock lockB = new ReentrantLock();
	
	public int getCounterA() {
		return counterA;
	}
	public int getCounterB() {
		return counterB;
	}

	public void incrementA() {
		lockA.lock();
		counterA++;
		lockA.unlock();
	}
	
 	public void incrementB() {
		lockB.lock();
		counterB++;
		lockB.unlock();
	}
	@Override
	public String toString() {
		return counterA + " " + counterB;
	}
	
}
