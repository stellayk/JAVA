package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("hostname: "+ip.getHostName());
			System.out.println("ip: "+ip.getHostAddress());
			
			InetAddress[] ips = InetAddress.getAllByName("www.google.com");
			for(InetAddress i : ips) {
				System.out.println("ip address: "+i);
			}
			
			byte[] ipAddr = ip.getAddress();
			for(byte b : ipAddr) {
				System.out.print(((b<0) ? b + 256 : b) + ".");
			}
			
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("ip address of this computer: "+local);
			
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress()+ " address: "+ip2);
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
	}

}
