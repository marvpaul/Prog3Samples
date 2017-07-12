package Threads.PipeExample;

import java.io.IOException;

/**
 * A producer which produces ten values and add to pipe
 */
public class Produce extends Thread{
	private Pipe pipe;

	public Produce(Pipe pipe) {
		this.pipe = pipe;
	}

	@Override
	public void run(){
		synchronized (pipe){
			for(int i = 0; i < 10; i++){
				try {
					pipe.set(i);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
