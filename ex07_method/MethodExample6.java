package ex07_method;

public class MethodExample6 {
	public static void main(String[] args) {
		int num=20;
		char data = '*';		
		print(num,data);

	}

	// 메서드 정의
	
	public static void print(int p_num,char p_data) {
		for(int i=0;i<p_num;i++) {
		
		System.out.print(p_data);		
	
		}
	}
}
