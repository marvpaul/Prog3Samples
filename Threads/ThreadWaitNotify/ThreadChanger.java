package Threads.ThreadWaitNotify;

/**
 * Created by marvin on 12.07.17.
 */
public class ThreadChanger {
	public static Object changeManager = new Object();
	public static boolean initialRunning = true;

	public static void main(String[] args) {
		Thread a = new ThreadA();
		Thread b = new ThreadB();
		a.start();
		b.start();
	}
}
