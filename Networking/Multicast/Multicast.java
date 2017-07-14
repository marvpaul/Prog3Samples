package Networking.Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Basic example of multicasting
 * Idea: One sends, two receive data
 */
public class Multicast extends Thread{

	private boolean sendMes;

	public static void main(String[] args) {

		Thread client1 = new Multicast(true);
		Thread client2 = new Multicast(false);
		Thread client3 = new Multicast(false);
		client3.start();
		client2.start();
		client1.start();
	}


	public Multicast(boolean sendMes) {
		this.sendMes = sendMes;
	}

	@Override
	public void run(){
		System.setProperty("java.net.preferIPv4Stack", "true");
		try {
			//Joining
			MulticastSocket sock = new MulticastSocket(1234);
			InetAddress addr = InetAddress.getByName("230.0.0.1");
			sock.joinGroup(addr);

			//Prepare data to send
			byte[] buf = "Hello Server".getBytes();
			DatagramPacket pack = new DatagramPacket(buf, buf.length, addr, 1234);

			if(sendMes){
				System.out.println("Sending ...");
				sock.send(pack);
			} else{
				System.out.println("Receiving ...");
				sock.receive(pack);
				System.out.println("Client : " + new String(pack.getData(), 0, pack.getLength()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
