package Networking.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * A simple server which receives and sends a message via UDP
 */
public class Server extends Thread{

	@Override
	public void run(){
		try {
			DatagramSocket sock = new DatagramSocket(1234);
			byte[] buf = new byte[1000];
			DatagramPacket pack = new DatagramPacket(buf, buf.length);
			sock.receive(pack);

			System.out.println("Client sends: " + new String(pack.getData(), 0, pack.getLength()));

			pack.setData("Hello back".getBytes());
			sock.send(pack);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
