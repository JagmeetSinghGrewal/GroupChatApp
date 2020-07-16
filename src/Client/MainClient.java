package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class MainClient {
	
	private static final String HOST = "localhost";
	private static final int PORT = 9999;
	private static final String EXIT = "exit";
	
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(HOST, PORT);
			
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			
			ClientWriteThread writeThread = new ClientWriteThread(out);
			writeThread.start();
			
			while(true) {
				
			}
			
		} catch (IOException e) {
			print("Error in Socket: " + e.getLocalizedMessage());
		}
	}
	
	private static void print(String s) {
		System.out.println(s);
	}

}
