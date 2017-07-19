package threads;

public class ThreadsWithSynchronization {

	public void doTheChacha() {
		CriticalSection cs = new CriticalSection();
		new MyThread(cs).start();
		new MyThread(cs).start();
	}
}

class MyThread extends Thread {
	private CriticalSection cs;

	public MyThread(CriticalSection cs) {
		this.cs = cs;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				cs.increment();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class CriticalSection {
	int someValue = 0;

	public synchronized void increment() throws InterruptedException {
		// some long running task
		someValue++;
		Thread.sleep(100);
		someValue++;

		System.out.println(someValue);
	}
}
