import java.io.*;
import java.net.*;

public class Server {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(5050);
		Socket s = ss.accept();
		
		System.out.println("Client connected!");
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Hello World");
		pr.flush();		
	}
}
