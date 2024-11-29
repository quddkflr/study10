package ex09_7object;

public class HundredNumbers {
	static int arr[];
	HundredNumbers(){
		System.out.println("여기는 생성자 입니다.");
		
	}
	static {
		System.out.println("클래스 초기화 블럭");
		arr = new int[100];
		
		for (int cnt = 0; cnt < 100; cnt++) {
			arr[cnt] = cnt;
			System.out.print(arr[cnt] + "\t");
		}
		System.out.println();
	}

}
