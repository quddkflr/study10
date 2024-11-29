package ex68_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample3 {
	public static void main(String args[]) {
		FileWriter writer = null;

		try {
			writer = new FileWriter("src/ex68_FileWriter/99dan.txt");
			for (int dan = 2; dan <= 9; dan++) {
				writer.write("[" + dan + "단]" + "\t");
			}

			for (int b = 1; b < 10; b++) {
				writer.write("\n");
				for (int a = 2; a < 10; a++)
					writer.write(a + "*" + b + "=" + b * a + "\t");

			}
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
