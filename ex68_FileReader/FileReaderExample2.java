package ex68_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
	public static void main(String args[]) {

		try {
			FileReader reader = new FileReader("poem.txt");

			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			reader.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
