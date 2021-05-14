package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
			
			InetAddress serverIP = InetAddress.getByName("127.0.0.1");
			while(true) {
				String data = sysin.readLine();
				DatagramSocket dataSocket = new DatagramSocket();
				
				byte[] msg1 = data.getBytes();
				
				DatagramPacket outPacket = new DatagramPacket(msg1, msg1.length, serverIP, 9500);
				dataSocket.send(outPacket);
				
				dataSocket.close();
			}
					
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
