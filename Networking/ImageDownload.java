package Networking;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Simple class which downloads an image and save to image.png
 */
public class ImageDownload {
	private static final String imageLocation = "http://javatutorialhq.com/wp-content/uploads/2013/09/java-bufferedReader-read-method-example.png";
	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL(imageLocation);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		try(BufferedInputStream in = new BufferedInputStream(url.openStream());
		    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("image.png"))){
			byte[] buffer = new byte[16000];
			int c;
			while((c = in.read(buffer, 0, 16000)) != -1){
				out.write(buffer, 0, c);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
