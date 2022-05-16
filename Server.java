import java.io.*;
import java.net.*;

public class Server {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(5050);
		Socket s = ss.accept();
		
		System.out.println("Client connected!");
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		String msg = br.readLine();
		System.out.println("[CLIENT] " + msg);
	}
}