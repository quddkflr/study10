package ex69_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample1 {
	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("파일명을 Arguments탭에 output1.dat입력해 주세요~");
			return;
		}
		FileInputStream in = null;
		try {
			in = new FileInputStream(args[0]);

			byte arr[] = new byte[21];
			while (true) {
				int num = in.read(arr);

				if (num == -1)
					break;

				System.out.println("\n16진수 출력");
				for (int cnt = 0; cnt < num; cnt++)
					System.out.printf("%02X ", arr[cnt]);

				System.out.println("\n\n10진수 출력");
				for (int cnt = 0; cnt < num; cnt++)
					System.out.printf("%02d ", arr[cnt]);

				System.out.println("\n\n8진수 출력");
				for (int cnt = 0; cnt < num; cnt++)
					System.out.printf("%02o ", arr[cnt]);

			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(args[0]+"파일이 존재하지 않습니다.");
		}catch (IOException ioe) {
			System.out.println(args[0]+"파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (in != null)
					in.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
