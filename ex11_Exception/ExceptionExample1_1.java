package ex11_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionExample1_1 {
	public static void main(String args[]) {
		FileReader reader = null;
		try{
		 reader = new FileReader("some.txt");
		}catch (Exception e) {
			
			System.out.println("입출력 에러가 발생했습니다.");
			}finally{
				try {
					reader.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
}
}
}