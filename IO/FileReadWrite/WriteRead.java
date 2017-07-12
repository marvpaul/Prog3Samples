package IO.FileReadWrite;

import java.io.*;

/**
 * Write and read data from a file using Input / Outputstreams
 * Autocloseable interface is using as well
 */
public class WriteRead {
	public static final String myText = "This is a sample text to write to a text file \n " +
										"Just look at it, here's a line break as well";
	public static final String myFile = "aFile.txt";
	public static void main(String[] args) {
		write();
		System.out.println(read());


		System.out.println(readFiltered());

	}


	public static void write(){
		try(FileOutputStream out = new FileOutputStream(new File(myFile))) {
			out.write(myText.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String read(){
		String readedText = "";
		try(FileInputStream in = new FileInputStream(new File(myFile))) {
			int i;
			while((i = in.read()) != -1){
				readedText += (char)i;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return readedText;
	}

	public static String readFiltered(){
		String readedText = "";
		try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)))) {
			String temp = "";
			while((temp = in.readLine()) != null)
				readedText += temp;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return readedText;
	}
}
