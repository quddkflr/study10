package ex69_FileInputStream_FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileoutputStreamExample1 {
	public static void main(String args[]) {
		FileOutputStream out = null;

		try {
			out = new FileOutputStream("output1.dat");
			byte arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
			for (int cnt = 0; cnt < arr.length; cnt++) {
				out.write(arr[cnt]);
			}

		} catch (IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다.");
		} finally {
			try {
				if (out != null)
					out.close();
				System.out.println("파일을 저장했습니다.");
			} catch (IOException e) {
				System.out.println("IOException");

			}
		}
	}
}