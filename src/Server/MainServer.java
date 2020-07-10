package Server;

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
		} catch (Exception e) {
			print("Error in settings up server socket");
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
 