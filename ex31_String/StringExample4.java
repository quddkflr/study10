package ex31_String;

class StringExample4 {
	public static void main(String args[]) {
		String str1 = new String("자바");
		String str2 = new String("자바");
		
		if (str1.equals(str2))
			System.out.println("str1 == str2 같음");
		else
			System.out.println("str1 == str2 다름");
	}

}