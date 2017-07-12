package Threads.ThreadSynchro;

/**
 * Using synchronized keyword in a block to synchronize two threads
 * Basically each thread will increment a variable 500000 times
 */
public class SyncedBlock extends Thread{
	public static int number = 0;

	public void run(){
		for (int i = 0; i < 500000; i++){
			synchronized (getClass()){
				number++;
			}
		}
	}
}
