package Networking.ServerClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Simple server
 */
public class Server extends Thread{

	@Override
	public void run(){
		try {
			ServerSocket sock = new ServerSocket(10900);
			Socket s = sock.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			//Get request
			System.out.println(in.readLine());

			//Send reply
			s.getOutputStream().write("Greets from Server\n".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
