package ex09_6object;

public class Numbers_make {
	public static void main(String[] arms) {
		int arr[]  = {10,20,30,40,50};
		Numbers obj = new Numbers(arr);
		print(obj);
	
	}
	static void print(Numbers obj) {
		System.out.println("합계 = " + obj.getTotal());
		System.out.println("평균 = " + obj.getAverage());
	}

}
