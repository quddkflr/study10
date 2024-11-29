package ex74_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputExample1 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output.dat"));

			out.writeObject(new GregorianCalendar(2023, 0, 14));
			out.writeObject(new GregorianCalendar(2023, 0, 15));
			out.writeObject(new GregorianCalendar(2023, 0, 16));
		}
		catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				if (out != null)
					out.close();
			} 
			catch (IOException e) {
				System.out.println("파일을 닫는 중 오류 발생했습니다.");
			}
		}
	}

}
