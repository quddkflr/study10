package ex71_BufferedWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedreaderExample1_write2 {
	public static void main(String args[]) {

		BufferedReader reader = null;
		String message = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex71_BufferedWriter/output2.dat"));
			
			while ((message = reader.readLine()) != null) {
				System.out.println(message);
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
				System.out.println("닫는 중 오류입니다.");
			}
		}
	}
}
