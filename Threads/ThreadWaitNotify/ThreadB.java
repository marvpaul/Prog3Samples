package Threads.ThreadWaitNotify;

/**
 * Thread B will notify Thread A to wake up
 */
public class ThreadB extends Thread {
	@Override
	public void run(){
		synchronized (ThreadChanger.changeManager){
			ThreadChanger.initialRunning = false;
			System.out.println("B is running because A is wait()ing");
			ThreadChanger.changeManager.notify();
		}
	}
}
