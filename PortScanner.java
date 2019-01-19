package Default;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class PortScanner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a domain name:");
		String host=input.next();
		
		for(int i=0;i<65536;i++) {
			try{
				InetSocketAddress socketaddress=new InetSocketAddress(host,i);
				Socket s=new Socket();
				s.connect(socketaddress, 500);
				System.out.println("Port "+i+ " is open and working\n");
				s.close();
				input.close();
			}
			catch(IOException ioex) {
				System.out.println(i+" port is closed");
			}
		}
	}

}
