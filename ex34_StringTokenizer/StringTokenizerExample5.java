package ex34_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample5 {
	public static void main(String args[]) {
		
		//true: 구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok =new StringTokenizer("사과=10|초콜렛=3|샴페인=1","=|",true);
		
		while(stok.hasMoreTokens()) {
			String token =stok.nextToken();
			System.out.println(token);			
		}
	}
}
