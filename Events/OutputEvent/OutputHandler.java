package Events.OutputEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Simple handler for console output
 */
public class OutputHandler {
	private OutputStream out;
	private ArrayList<IOutputEventListener> list;

	public OutputHandler(OutputStream out) {
		this.out = out;
		list = new ArrayList<>();
	}

	public void add(IOutputEventListener listener){
		list.add(listener);
	}

	public void remove(IOutputEventListener listener){
		list.remove(listener);
	}

	public void writeToConsole(String message){
		try {
			out.write(message.getBytes());
			notifyAllListeners(new OutputEvent(message));
		} catch (IOException e) {
			System.err.println("Sth went wrong while writing to console");
		}
	}

	private void notifyAllListeners(OutputEvent event){
		for (IOutputEventListener listener: list) {
			listener.onOutputEvent(event);
		}
	}
}
