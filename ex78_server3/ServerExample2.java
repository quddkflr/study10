package ex78_server3;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {
	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다.~");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			System.out.println("==============접속 정보==============");
			System.out.println(socket.getInetAddress().getHostAddress()+"에서 접속하였습니다.");
			System.out.println("==================================");
			
			Thread thread2 = new ReceiverThread(socket);
			Thread thread1 = new SenderThread(socket);
			
			thread1.start();
			thread2.start();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				
			} catch (Exception ignored) {
				System.out.println("소켓 닫는 중 에러입니다.");
			}
		}
	}

}
