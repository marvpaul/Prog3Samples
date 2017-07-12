package Threads.PipeExample;

import java.io.*;

/**
 * Hopefully the simplest pipe class ever :D
 */
public class Pipe {
	private DataOutputStream out;
	private DataInputStream in;

	public Pipe() throws IOException {
		PipedOutputStream src = new PipedOutputStream();
		PipedInputStream snk = new PipedInputStream();
		src.connect(snk);

		out = new DataOutputStream(src);
		in = new DataInputStream(snk);
	}

	public void set(int i) throws IOException {
		out.writeInt(i);
	}

	public int get() throws IOException {
		return in.readInt();
	}
}
