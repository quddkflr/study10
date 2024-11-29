package ex68_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
	public static void main(String args[]) {
		FileWriter writer = null;
		try {						
			writer = new FileWriter("output.txt",true);

			String message = "감기 조심하세요~";
			writer.write(message);
			
			writer.write("\n");
			
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
