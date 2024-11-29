package ex53_System_arraycopy;

public class System1_arraycopy2 {
	public static void main(String args[]) {
		char arr1[] =
			{'가','나','다','라','마','바','사','아','자','차','카','타','파','하'};
		char arr2[]=
			{'a','b','c','d','e','f','g','h','i','j','k'};
		char arr3[]=new char[arr1.length];
		
		//System.arraycopy(원본 배열, 원본 항목 시작 위치,
		//				   복사 대상 배열, 복사 대상 항목 시작 위치,복사할 항목의 수);
		//arr1[10]~arr1[12]의 값을 arr2[2]~arr2[4]에 복사
		System.arraycopy(arr1, 0,
						 arr3, 0, arr1.length);
		
		for(char ch : arr3)
			System.out.print(ch+"  ");
	}
}