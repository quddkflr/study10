package ex32_String;

public class StringExample1 {
	public static void main(String[] args) {
		
		String message = "Java program creates many objects.";
		
		int index1 = message.indexOf('a');
		System.out.println("a의 위치는 " + index1);
		
		int index2 = message.indexOf(97);
		System.out.println("a의 위치는 " + index2);
		
		int index23 = message.indexOf(65);
		System.out.println("A의 위치는 " + index23);
		
		int index3 = message.indexOf('a',13);
		System.out.println("13번 부터 a의 위치는 " + index3);
		
		int index4 = message.indexOf("av");
		System.out.println("av로 시작하는 index는 " + index4);
		
		int index5 = message.indexOf("man",12);
		System.out.println("12번쨰 부터 man위치는 " + index5);
		
		int index6 = message.indexOf("jave");
		System.out.println("java의 위치는 " + index6);
	}

}
