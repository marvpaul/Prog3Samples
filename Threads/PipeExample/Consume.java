package Threads.PipeExample;

import java.io.IOException;

/**
 * A simple consumer class which will consume content in pipe and print out
 */
public class Consume extends Thread{
	private Pipe pipe;

	public Consume(Pipe pipe) {
		this.pipe = pipe;
	}

	@Override
	public void run(){
		synchronized (pipe){
			for(int i = 0; i < 10; i++){
				try {
					System.out.println(pipe.get());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
