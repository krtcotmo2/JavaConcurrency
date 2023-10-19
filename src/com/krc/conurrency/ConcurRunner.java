package com.krc.conurrency;

public class ConcurRunner {

	public static void main(String[] args) {
		Counter c = new Counter();
		c.increment();
		System.out.println(c.getCounter());
	}

}
