package ex78_server4;

import java.net.Socket;

public class ClientExample2 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("대화명을 입력하세요");
			return;
		}
		try {
			System.out.println("===========-======================");
			System.out.println("나의 대화명은 " + args[0] + "입니다.");
			System.out.println("==================================");
			
			Socket socket = new Socket("192.168.0.6", 9002);
			//Socket socket = new Socket("127.0.0.1", 9002);

			Thread thread1 = new SenderThread(socket, args[0]);
			
			Thread thread2 = new ReceiverThread(socket);

			thread1.start();
			thread2.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

