package IO.Serialize;

import java.io.Serializable;

/**
 * A sample class which will be serialized and deserialized
 */
public class SampleClass implements Serializable{
	private static final long serialVerionUID = 1L;
	private String attribute;

	public SampleClass(String attribute) {
		this.attribute = attribute;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
