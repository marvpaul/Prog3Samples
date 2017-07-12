package Networking.ServerClient;

/**
 * WriteRead class which runs client and server as a thread
 */
public class Main {
	public static void main(String[] args) {
		Server s = new Server();
		s.start();

		Client c = new Client();
		c.start();
	}
}
