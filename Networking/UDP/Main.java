package Networking.UDP;

/**
 * Created by marvin on 13.07.17.
 */
public class Main {
	public static void main(String[] args) {
		Thread client = new Client();
		Thread server = new Server();

		server.start();
		client.start();
	}
}
