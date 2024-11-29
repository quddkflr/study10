package ex68_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample4 {
	public static void main(String args[]) {
		FileReader reader = null;
		char arr[] = new char[64];

		try {
			reader = new FileReader("거위의 꿈.txt");

			while (true) {
				int num = reader.read(arr);
				if (num == -1)
					break;

				for (int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%c", arr[cnt]);
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("IOException");

			}
		}
	}
}