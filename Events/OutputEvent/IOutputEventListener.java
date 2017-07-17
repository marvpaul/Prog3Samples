package Events.OutputEvent;

import java.util.EventListener;

/**
 * Interface for all EventListeners
 */
public interface IOutputEventListener extends EventListener {
	public void onOutputEvent(OutputEvent event);
}
