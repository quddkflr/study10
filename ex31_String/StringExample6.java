package ex31_String;

class StringExample6 {
	public static void main(String args[]) {
		String str = "나를 사랑하는 자바";
		
		for (int a = 0; a < str.length(); a++) {
			char ch = str.charAt(a);
			System.out.println("index =" + a + " 문자 = " + ch);
		}
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6));
	}
}
