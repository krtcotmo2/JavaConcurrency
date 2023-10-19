package com.krc.conurrency;

public class Counter {
	private int counter = 0;
	
	public int getCounter() {
		return counter;
	}
	// synchronized allows only one thread to make an adjustment and all 
	// other threads queue up behind it. Works good if there is only one
	//synchronized method
	synchronized public void increment() {
		counter++;
	}
}
