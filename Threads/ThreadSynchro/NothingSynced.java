package Threads.ThreadSynchro;

/**
 * Nothing is synchronized here
 * Basically each thread will increment a variable 500000 times
 */
public class NothingSynced extends Thread{
	public static int number = 0;

	@Override
	public void run(){
		for (int i = 0; i < 500000; i++){
			number++;
		}
	}
}
