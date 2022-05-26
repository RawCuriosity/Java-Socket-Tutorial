import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Server {
	private static ArrayList<ClientHandler> clients = new ArrayList<>();
	private static ExecutorService pool = Executors.newFixedThreadPool(15);
	
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(5050);
		System.out.println("[SERVER] Server started waiting for clients...");
		
		while (true) {
			Socket s = ss.accept();
			System.out.println("[SERVER] A new client has connected!");
			ClientHandler clientThread = new ClientHandler(s);
			clients.add(clientThread);
			
			pool.execute(clientThread);
		}
	}
}