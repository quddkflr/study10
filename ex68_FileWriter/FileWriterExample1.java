package ex68_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
	public static void main(String args[]) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");

			char arr[] = { '내', '꺼', '인', ' ', '듯', ' ', '내', '꺼', ' ', '아', '닌', ' ', '내', '꺼', ' ', '같', '은', ' ',
					'너' };

			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				System.out.println("파일을 닫는 중 오류입니다.");

			}
		}
	}
}
