package Events.OutputEvent;

/**
 * This class represents an OutputEvent where the written text is stored in printedMessage
 */
public class OutputEvent {
	private String printedMessage;

	public OutputEvent(String printedMessage) {
		this.printedMessage = printedMessage;
	}

	public String getPrintedMessage() {
		return printedMessage;
	}
}
