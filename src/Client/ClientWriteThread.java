package Client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClientWriteThread extends Thread{
	private final String EXIT = "exit";
	
	private Boolean connected  = true;
	private DataOutputStream out; 
	
	public ClientWriteThread(DataOutputStream outStream) {
		this.out = outStream;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while(connected) {
			String line = sc.next();
			
			if(line.equals(EXIT)) {
				connected = false;
			} else {
				sendMessage(line);
			}
		}
		
		sc.close();
	}
	
	private void sendMessage(String message) {
		try {
			out.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			print("Error: " + e.getLocalizedMessage());
		}
	}
	
	private static void print(String s) {
		System.out.println(s);
	}
}