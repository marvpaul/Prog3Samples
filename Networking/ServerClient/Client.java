package Networking.ServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Simple client
 */
public class Client extends Thread{
	@Override
	public void run(){
		try{
			Socket s = new Socket("127.0.0.1", 10900);

			//Send request
			s.getOutputStream().write("Hello Server\n".getBytes());
			s.getOutputStream().flush();

			//Get reply from server
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(in.readLine());

		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
