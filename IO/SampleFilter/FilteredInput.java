package IO.SampleFilter;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A custom Filter stream which will decrement each red int
 */
public class FilteredInput extends FilterInputStream {
	/**
	 * Creates a <code>FilterInputStream</code>
	 * by assigning the  argument <code>in</code>
	 * to the field <code>this.in</code> so as
	 * to remember it for later use.
	 *
	 * @param in the underlying input stream, or <code>null</code> if
	 *           this instance is to be created without an underlying stream.
	 */
	protected FilteredInput(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int i = in.read();
		return --i;
	}

	public String readString() throws IOException {
		int i;
		String result = "";
		while((i = read()) != -2){
			result += (char) i;
		}
		return result;
	}
}
