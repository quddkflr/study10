package ex57_Runnavle_Interface;

public class MultithreadExample1 {
	public static void main(String args[]) {
		SmallLetters small = new SmallLetters();
		Thread thread = new Thread(small);
		thread.start();
		
		char arr[] = { 'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ',
					   'ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char ch : arr)
			System.out.print(ch);
		
		}

}
