import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {
	private Socket s;
	private InputStreamReader in;
	private BufferedReader br;
	private PrintWriter pr;
	
	public ClientHandler(Socket socket) throws IOException {
		this.s = socket;
		in = new InputStreamReader(s.getInputStream());
		br = new BufferedReader(in);
		pr = new PrintWriter(s.getOutputStream());
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				System.out.println(msg);
			}
		}
		catch (IOException e) {
			System.err.println("IO exception!");
			System.err.println(e.getStackTrace());
		}
		finally {
			pr.close();
			try {
				br.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}