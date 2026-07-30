package br.com.joaofelipefaria.java.samples;

import java.util.Iterator;

public class MultiThread {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		final int threads = 10;
		final int incrementsPerThread = 100_000;

		Thread[] workers = new Thread[threads];

		for (int i = 0; i < threads; i++) {
			workers[i] = new Thread(() -> {
				for (int j = 0; j < incrementsPerThread; j++) {
					counter++; 
				}
			});
		}
		
		long start = System.currentTimeMillis();
		
		for (Thread t : workers) {
			t.start();
		}
		
		for (Thread t : workers) {
			t.join();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Valore Esperado : " + (threads * incrementsPerThread));
		System.out.println("Valor obtido    : " + counter);
		System.out.println("Tempo           : " + (end - start) + " ms");
	}
}
