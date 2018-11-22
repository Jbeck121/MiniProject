package MiniProject;

import java.io.IOException;
import java.net.*;

public class Client {
	
	public Client() throws IOException { 
		
		DatagramSocket datagramSocket = new DatagramSocket(2222);
			byte[] buffer = new byte[65508];
			InetAddress address = InetAddress.getLocalHost();

			DatagramPacket packet = new DatagramPacket(
					buffer, buffer.length, address, 9000);
			datagramSocket.send(packet);
				

	}
}
