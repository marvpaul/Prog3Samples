package Events.OutputEvent;

/**
 * Just write a line to the console via OutputHandler and see how the listeners will fire :)
 */
public class Main {
	public static void main(String[] args) {
		OutputHandler out = new OutputHandler(System.out);

		//Add two EventListeners
		out.add(event -> System.out.println("Sth was written to console!"));
		out.add(event -> System.out.println(event.getPrintedMessage() + " was printed!"));

		//Print a message to console via OutputHandler
		out.writeToConsole("Hello there!");
	}
}
