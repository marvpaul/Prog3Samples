package Threads.ThreadSynchro;

/**
 * This is a basic example of a synchronized / not synchronized static variable
 * which will be iterated by two threads :)
 */
public class SynchronizedMain extends Thread{

	public static void main(String[] args) {
		//Starting two threads which are trying to access same variable async
		Thread th1 = new NothingSynced();
		Thread th2 = new NothingSynced();
		th1.start();
		th2.start();

		//Wait for the two threads to come to an end
		try {
			th1.join();
			th2.join();
			System.out.println("Nothing synced: " + NothingSynced.number + ", expected: 1000000");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Starting two threads which are trying to access same variable SYNCED
		th1 = new SyncedBlock();
		th2 = new SyncedBlock();
		th1.start();
		th2.start();

		//Wait for the two threads to come to an end
		try {
			th1.join();
			th2.join();
			System.out.println("Synced block: " + SyncedBlock.number + ", expected: 1000000");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Starting two threads which are trying to access same variable SYNCED
		th1 = new ConcurrentSynced();
		th2 = new ConcurrentSynced();
		th1.start();
		th2.start();

		//Wait for the two threads to come to an end
		try {
			th1.join();
			th2.join();
			//Wait for the two threads to come to an end
			try {
				th1.join();
				th2.join();
				System.out.println("Concurrent concept: " + ConcurrentSynced.number + ", expected: 1000000");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
