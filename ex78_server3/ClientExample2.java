package ex78_server3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class ClientExample2 {
	public static void main(String[] args) {
		System.out.println("여기는 클라이언트 입니다.~");

		Socket socket = null;
		try {
			socket = new Socket("192.168.0.3", 9001);

			Thread thread2 = new ReceiverThread(socket);
			Thread thread1 = new SenderThread(socket);

			thread1.start();
			thread2.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
