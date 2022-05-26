import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	PrintWriter pr;
	
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Socket s = new Socket("localhost", 5050);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String msg = sc.nextLine();
			pr.println("[CLIENT] " + msg);
			pr.flush();
		}
	}
}
