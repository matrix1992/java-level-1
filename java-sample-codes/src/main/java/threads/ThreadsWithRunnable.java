package com.tower.java.examples.threads;

public class ThreadsWithRunnable {

	private final Runnable mFirstRunnable = new Runnable() {

		private int count = 1;

		public void run() {
			while (count < 10) {
				System.out.println("first : " + count++);
			}
		}
	};
	
	private final Runnable mSecondRunnable = new Runnable() {

		private int count = 1;

		public void run() {
			while (count < 10) {
				System.out.println("second : " + count++);
			}
		}
	};

	private void executeThreads() {
		new Thread(mFirstRunnable).start(); // start first thread
		new Thread(mSecondRunnable).start(); // start second thread

		// new Thread(mSecondRunnable).run(); // what will happen ??
	}

	public static void main(String[] args) {
		new ThreadsWithRunnable().executeThreads();
	}
}
