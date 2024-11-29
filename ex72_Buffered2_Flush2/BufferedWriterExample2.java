package ex72_Buffered2_Flush2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample2 {
	public static void main(String args[]) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src/ex71_Buffered2_Flush2/output.txt");
			
			bw = new BufferedWriter(fw,5);

			char arr[] = { '내', '꺼', '인', '1', '듯',
					       '2', '내', '꺼', '3', '아', 
					       '닌', '4', '내', '꺼', '5',
					       '같', '은', '6','너' };

			for (int cnt = 0; cnt < arr.length; cnt++)
				bw.write(arr[cnt]);
			
			bw.flush();
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}
		}
	}
}
