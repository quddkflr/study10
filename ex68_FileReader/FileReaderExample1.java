package ex68_FileReader;

import java.io.FileReader;

public class FileReaderExample1 {
	public static void main(String args[]) {
						
		FileReader reader = new FileReader("poem.txt");
		
		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			char ch = (char) data;
			System.out.println(ch);
		}
		reader.close();
			
	}

}
