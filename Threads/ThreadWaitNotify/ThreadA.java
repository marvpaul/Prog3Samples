package Threads.ThreadWaitNotify;

/**
 * Thread A will wait until Thread B notify A again
 */
public class ThreadA extends Thread{
	@Override
	public void run(){
		synchronized (ThreadChanger.changeManager){
			while(ThreadChanger.initialRunning){
				System.out.println("A is running, and now: wait()");
				try{
					ThreadChanger.changeManager.wait();
				} catch(Exception e){
					System.out.println("Sth went wrong while trying to wait!");
				}
			}
			System.out.println("A was notified() and run again");
		}
	}
}
