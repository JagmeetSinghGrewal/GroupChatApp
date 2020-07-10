package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	private final static int PORT = 9999;
	private final static Boolean DEBUG = false;
	
	
	public static void main(String[]  args) {
		try {
			ServerSocket s = new ServerSocket(PORT);
			while(true) {
				Socket so = s.accept();
				print("A client has connected");
			}
		} catch (IOException e) {
			print("Error: Problem in setting up socket server");
			print(e.getLocalizedMessage());
		} catch (Exception e) {
			print("Error: ");
			print(e.getLocalizedMessage());
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
 