package Events.SimpleObserver;

/**
 * Subject interface for a simple subject
 */
public interface ISubject {
	void addObserver(IObserver obs);
	void removeObserver(IObserver obs);
	void notifyAllObserver();
}
