package Threads.ThreadSynchro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Using concurrent to synchronize two threads
 * Basically each thread will increment a variable 500000 times
 */
public class ConcurrentSynced extends Thread{
	static Lock changeManager = new ReentrantLock();
	public static int number = 0;

	@Override
	public void run(){
		for (int i = 0; i < 500000; i++){
			changeManager.lock();
			try{
				number++;
			} catch (Exception e){
				System.out.println("Sth went wrong here");
			} finally {
				changeManager.unlock();
			}
		}

	}
}
