import java.io.*;
import java.net.*;

public class Client {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings({ "unused", "resource" })
		Socket s = new Socket("localhost", 5050);
	}
}