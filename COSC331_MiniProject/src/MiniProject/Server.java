package MiniProject;
	import java.net.*;
	import java.io.*;
public class Server {
	public Server() throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket(2222);
		
		byte[] buffer = new byte[10];
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		
		datagramSocket.receive(packet);
		
	}
}
