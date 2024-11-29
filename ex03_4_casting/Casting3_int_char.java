package ex03_4_casting;

public class Casting3_int_char {
	public static void main(String[] args) {
		
		int i3 = 97;
		char c1 = (char) i3;
		System.out.println("i3데이터는 " + i3 + "입니다.");
		System.out.println("c1데이터는 " + c1 + "입니다.");
		
		i3 = 65;
		c1 = (char) i3;
		System.out.println("i3데이터는 " + i3 + "입니다.");
		System.out.println("c1데이터는 " + c1 + "입니다.");
		
		i3='A';
		System.out.println("i3='A'데이터는 " + i3 + "입니다.");
		
		i3='가';
		System.out.println("i3'가'데이터는 " + i3 + "입니다.");
	}

}
