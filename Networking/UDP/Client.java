package Networking.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * A simple client which sends a message to loopback address via UDP
 */
public class Client extends Thread{

	@Override
	public void run(){
		try {
			DatagramSocket sock = new DatagramSocket();
			byte[] buf = "Hello Server".getBytes();
			DatagramPacket pack = new DatagramPacket(buf, buf.length, InetAddress.getLoopbackAddress(), 1234);
			sock.send(pack);
			sock.receive(pack);
			System.out.println(new String(pack.getData(), 0, pack.getLength()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
