package ex77_serialVersuonUTD_no;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputExample2 {
	public static void main(String args[]) {
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
		
				Rectangle obj =(Rectangle) in.readObject();
				System.out.println("***역직렬화 합니다.***");
				System.out.println(obj);
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				System.out.println("파일을 닫는 중 오류 발생했습니다.");
			}
		}
	}
}
