package ch19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DatagramSocket socket = new DatagramSocket(9500);
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while(true) {
				inMsg = new byte[1024];
				
				inPacket = new DatagramPacket(inMsg, inMsg.length);
				
				socket.receive(inPacket);
				
				String msg = new String(inMsg, 0, inPacket.getLength());
				System.out.println("Client message: "+msg);
				
				InetAddress address = inPacket.getAddress();
				
				int port = inPacket.getPort();
				System.out.println("Client's address: "+address);
				System.out.println("Client's port: "+port);
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
