package com.krc.conurrency;

public class BiCounter {
	private int counterA = 0;
	private int counterB = 0;
	
	public int getCounterA() {
		return counterA;
	}
	public int getCounterB() {
		return counterB;
	}
	// synchronized allows only one thread to make an adjustment and all 
	// other threads queue up behind it. With multiple methods, if method
	//  a is being used by thread 1 and thread 2 needs to use method b.
	// Thread 2 must wait for thread 1 to complete before it acts on its
	// method even though they do not impact the same areas. For this
	// reason  synchronized is not your friend.
	synchronized public void incrementA() {
		counterA++;
	}
	// synchronized allows only one thread to make an adjustment and all 
	// other threads queue up behind it. With multiple methods, if method
	//  a is being used by thread 1 and thread 2 needs to use method b.
	// Thread 2 must wait for thread 1 to complete before it acts on its
	// method even though they do not impact the same areas. For this
	// reason  synchronized is not your friend.
	synchronized public void incrementB() {
		counterB++;
	}
	@Override
	public String toString() {
		return counterA + " " + counterB;
	}
	
}
