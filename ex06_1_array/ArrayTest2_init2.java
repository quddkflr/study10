package ex06_1_array;

public class ArrayTest2_init2 {
	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[10];
		
		System.out.println("=====10개의 println()이용========");
		
		for (int a=1;a<arr.length;a++) {

		

		System.out.println("arr[" + a + "]=" + arr[a]);
		
	
	}
		System.out.println(arr.length);

	}
}