package Threads.PipeExample;

import java.io.IOException;

/**
 * Just starting two threads and synchronizing communication via pipe
 */
public class Main {
	public static void main(String[] args) {
		Pipe p = null;
		try {
			p = new Pipe();
		} catch (IOException e) {
			e.printStackTrace();
		}

		(new Produce(p)).start();
		(new Consume(p)).start();

	}
}
