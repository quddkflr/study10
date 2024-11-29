package ex78_server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class ClientExample1 {
	public static void main(String[] args) {
		System.out.println("여기는 클라이언트 입니다.~");

		Socket socket = null;
		try {
			socket = new Socket("192.168.0.3",9000);


			InputStream in = socket.getInputStream();

			OutputStream out = socket.getOutputStream();


			String str = "Hello, Server";
			
			out.write(str.getBytes());

			byte arr[] = new byte[128];
			in.read(arr);		
			System.out.println(new String(arr));
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
