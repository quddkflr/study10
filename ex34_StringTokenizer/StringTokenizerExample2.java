package ex34_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {
	public static void main(String args[]) {
		StringTokenizer stok =new StringTokenizer("사과 배 복숭아");
		
		while(stok.hasMoreTokens()) {//토큰이 있는 동안 반복하는 메서드
			System.out.println(stok.nextToken());
		}
	}

}
