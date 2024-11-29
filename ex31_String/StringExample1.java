package ex31_String;

public class StringExample1 {
	public static void main(String args[]){
		String str = "집에 가고 싶어요.";
		int len = str.length();
		
		for (int a= 0; a < len; a++) {
			char ch = str.charAt(a);
			System.out.println("index = " + a + "문자 =" + ch);
		}
	}

}
