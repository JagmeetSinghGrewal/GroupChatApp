package Client;

import java.io.IOException;
import java.net.Socket;

public class MainClient {
	
	private static final String HOST = "localhost";
	private static final int PORT = 9999;
	private static final Boolean DEBUG = false;
	
	public static void main(String[] args) {
		try {
			Socket s = new Socket(HOST, PORT);
		} catch (IOException e) {
			print("Error in Socket: " + e.getLocalizedMessage());
		}
	}
	
	private static void print(String s) {
		System.out.println(s);
	}
	
	private static void debug(String s) {
		if(DEBUG) {
			System.out.println(s);
		}
	}
}
