package ex34_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample4 {
	public static void main(String args[]) {
		
		//구분자-콤마(,)와 수직선(|)
		StringTokenizer stok =new StringTokenizer("사과,배|복숭아",",|");
		
		while(stok.hasMoreTokens()) {
			String str =stok.nextToken();
			System.out.println(str);
			
		}
	}
}
