import java.io.*;
import java.net.*;

public class Client {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Socket s = new Socket("localhost", 5050);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Hello World!");
		pr.flush();
	}
}