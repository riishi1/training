import java.io.FileInputStream;

public class FileInputDemo {
	public static void main(String[] args) throws Exception {
		String file = "D:/Demo/song.txt";
		FileInputStream istream = new FileInputStream(file);
		// Array of the size of available bytes in stream
		byte[] bar = new byte[istream.available()];
		istream.read(bar);	// reading stream data into byte array
		String content = new String(bar);	// converting byte array to string
		System.out.println(content);
		
/*		int ch = 0;
		while(true) {
			ch = istream.read();	// reading a byte from the stream
			if(ch == -1) break;		// EOF break the loop
			System.out.print((char)ch);	// printing character
		}*/
		
		istream.close();
	}
}
