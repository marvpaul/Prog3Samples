package Events.SimpleObserver;

/**
 * Simple implementation of a possible observer
 */
public class Observer implements IObserver {
	public static int numberOfObs = 0;
	private int obNumber = 0;

	public Observer() {
		numberOfObs ++;
		obNumber = numberOfObs;
	}

	@Override
	public void update(ISubject subject) {
		System.out.println("Observer " + obNumber + ": Sth was changed in the subject!");
		System.out.println("New data: " + ((Subject)subject).getSomeData());
	}
}
