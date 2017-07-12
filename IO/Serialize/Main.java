package IO.Serialize;

import java.io.*;

/**
 * Simple object serialization
 */
public class Main {
	public static final String myFile = "serializedObj.txt";
	public static void main(String[] args) {
		SampleClass myClass = new SampleClass("Attribute content");

		serialize(myClass);

		System.out.println(deserialize().getAttribute());
	}


	public static void serialize(SampleClass obj){
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(myFile))) {
			out.writeObject(obj);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SampleClass deserialize(){
		SampleClass obj = null;
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(myFile))){
			obj = (SampleClass)in.readObject();
		} catch (Exception e){
			e.printStackTrace();
		}
		return obj;
	}
}
