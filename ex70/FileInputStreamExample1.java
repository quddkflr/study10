package ex70;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample1 {
	String origialFileName = "D:/temp/koala.jpg";
	String targetFileName = "D:/temp2/koala.jpg_copy.jpg";
	try (FileInputStream fis = new FileInputStream(origialFileName);
			FileOutputStream fos = new FileOutputStream(targetFileName);
			)
	{
		byte[] readBytes = new byte[1024];
		while (fis.read(readBytes) != -1) {
			fos.write(readBytes);

		}
		System.out.println("복사가 되었습니다.");
		
	} catch (FileNotFoundException fnfe) {
		System.out.println("파일이 존재하지 않습니다.");
	} catch (IOException ioe) {
		System.out.println("파일을 읽을 수 없습니다.");
	}
}
}
