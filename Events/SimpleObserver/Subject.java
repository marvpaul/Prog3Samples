package Events.SimpleObserver;

import java.util.ArrayList;

/**
 * Simple implementation of a subject
 */
public class Subject implements ISubject {
	private int someData = 0;
	private ArrayList<IObserver> obs = new ArrayList<>();
	@Override
	public void addObserver(IObserver obs) {
		this.obs.add(obs);
	}

	@Override
	public void removeObserver(IObserver obs) {
		this.obs.remove(obs);
	}

	@Override
	public void notifyAllObserver() {
		for (IObserver observer: obs) {
			observer.update(this);
		}
	}

	public void setSomeData(int someData) {
		this.someData = someData;
		notifyAllObserver();
	}

	public int getSomeData() {
		return someData;
	}
}
