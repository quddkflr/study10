package ex78_server2;

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

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));

			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			writer.println("Hello, Server2");

			writer.flush();

			String str = reader.readLine();
			
			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				System.out.println("소켓 닫는 중 에러입니다.");
			}
		}
	}

}
