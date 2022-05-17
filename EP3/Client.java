import java.io.*;
import java.net.*;

public class Client {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Socket s = new Socket("localhost", 5050);
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		String msg = br.readLine();
		System.out.println("[SERVER] " + msg);
	}
}