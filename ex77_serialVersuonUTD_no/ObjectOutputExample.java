package ex77_serialVersuonUTD_no;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100, 200);
			System.out.println(obj);			
			out.writeObject(obj);
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		finally {
			try {
				if(out != null)
					out.close();
			}
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
