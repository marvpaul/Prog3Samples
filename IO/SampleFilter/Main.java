package IO.SampleFilter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * An example where myText will be written in myFile using a custom filter which will shift each character (encrypt)
 * another Filterstream will read myFile and do a back shifting (decrypt)
 */
public class Main {
	public static final String myText = "This is a sample text to write to a text file \n " +
			"Just look at it, here's a line break as well";
	public static final String myFile = "aFile.txt";
	public static void main(String[] args) {


		try(FilteredOutput out = new FilteredOutput(new FileOutputStream(myFile))){
			out.writeString(myText);
		} catch (Exception e){
			System.err.println("Sth went wrong!");
		}

		try(FilteredInput in = new FilteredInput(new FileInputStream(myFile))){
			System.out.println(in.readString());
		} catch (Exception e){

		}
	}
}
