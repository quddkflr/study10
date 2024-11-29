package ex78_server4;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {
	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.~");
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002);
			
			while (true) {
				
				Socket socket = serverSocket.accept();
				
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

			}
		}
	}



