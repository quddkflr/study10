package ex34_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample7 {
	public static void main(String args[]) {
		StringTokenizer phone =new StringTokenizer("010-1234-5678","-",true);
		
		while(phone.hasMoreTokens()) {
			String token =phone.nextToken();
			if(token.equals("-"))
			System.out.println();
			else
			System.out.print(token);
		}
	}
}