package com.tower.java.examples.threads;

public class CustomThreadExample {
	
	private void executeThreads() {
		new CustomThread("first").start(); // start first thread
		new CustomThread("second").start(); // start second thread

	}
	
	public static void main(String[] args) {
		new CustomThreadExample().executeThreads();
	}
	
	class CustomThread extends Thread {
		private int count = 1;
		private String threadName;
		
		CustomThread(String threadName) {
			this.threadName = threadName;
		}
		
		public void run() {
			while(count < 10) {
				System.out.println(threadName + " : " + count++ );
				try {
					// sleep for some time
					sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
