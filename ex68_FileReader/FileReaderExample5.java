package ex68_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample5 {
	public static void main(String args[]) {
		FileReader reader = null;
		char arr[] = new char[64];

		try (
			FileReader reader1 = new FileReader("src/ex68_FileReader/1.txt");
			) {

			while (true) {
				int num = reader1.read(arr);
				
				if (num == -1)
					break;

				System.out.println(new String(arr,0,num));
				}			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
				System.out.println("final입니다.");

			}
		}
	}
