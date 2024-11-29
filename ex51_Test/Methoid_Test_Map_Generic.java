package ex51_Test;

import java.util.HashMap;
import java.util.Scanner;

public class Methoid_Test_Map_Generic {
	static HashMap<String, Integer> max_min(int data[]){
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		int result[] = {data[0], data[0]};
		
		for(int i=1; i < data.length; i++) {
			if(result[0] < data[i]) result[0] = data[i]; //max
			if(result[1] > data[i]) result[1] = data[i]; //min
			
		}
		hm.put("최댓값", result[0]);
		hm.put("최솟값", result[1]);
		return hm;

	}
	public static void main(String args[]){
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("다섯 개의 정수를 입력 하세요");
		for (int a = 0; a < data.length; a++) {
			data[a] = sc.nextInt();{}
			
			HashMap<String, Integer> m = max_min(data);
			System.out.println("최댓값 = " + m.get("최댓값"));
			System.out.println("최솟값 = " + m.get("최솟값"));
		
			sc.close();
		
		}
	
	}

}


