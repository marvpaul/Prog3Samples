package IO.SampleFilter;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * A custom Filter stream which will increment each given int
 */
public class FilteredOutput extends FilterOutputStream{

	/**
	 * Creates an output stream filter built on top of the specified
	 * underlying output stream.
	 *
	 * @param out the underlying output stream to be assigned to
	 *            the field <tt>this.out</tt> for later use, or
	 *            <code>null</code> if this instance is to be
	 *            created without an underlying stream.
	 */
	public FilteredOutput(OutputStream out) {
		super(out);
	}

	@Override
	public void write(int i) throws IOException {
		i++;
		out.write(i);
	}

	public void writeString(String str) throws IOException {
		for (char i : str.toCharArray()) {
			write((int)i);
		}
	}
}
