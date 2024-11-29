package ex06_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayTest2_init999 {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		String names[] = {"홍길동","전우치","홍길동","세종대왕","김길동"};
		
		System.out.println("검색할 이름을 입력하세요.");
		System.out.print("이름:");
		 String inputname = sc.next();
		 
		 for (int a = names.length-1; a >=0 ; a--) {
		 if (inputname.equals(names[a])) {
			System.out.println(inputname+"는(은) 배열의 인덱스"+ a + "에서 찾았습니다.");
			break;
		 }
		 if (a==0)
		 System.out.println(inputname+"는(은) 배열방에서 찾지 못했습니다.");
			 
		}
	}
}
	

