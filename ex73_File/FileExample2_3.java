package ex73_File;

import java.io.File;

public class FileExample2_3 {
	public static void main(String ars[]) {
		
		//디렉토리(폴더) 안에 파일있으면 삭제 못함

		File f4 = new File("D:/newDirectory");
		if (f4.exists()) {
			if (f4.delete()) {
				System.out.println(f4.getPath() + " 삭제했습니다.");
			} else {
				System.out.println(f4.getPath() + " 삭제 하지 못했습니다.");
			}
		} else {
			System.out.println(f4.getPath() + "에 삭제하고자 하는 디렉토리가 없습니다.");
		}
	}
}
