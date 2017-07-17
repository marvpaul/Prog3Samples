package Events.SimpleObserver;

/**
 * Implementation of the observer pattern
 */
public class Main {
	public static void main(String[] args) {
		Subject sub = new Subject();
		IObserver observer1 = new Observer();
		IObserver observer2 = new Observer();
		sub.addObserver(observer1);
		sub.addObserver(observer2);

		//Just one method call to notify all registered observers
		sub.setSomeData(10);
	}
}
