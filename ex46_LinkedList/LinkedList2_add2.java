package ex46_LinkedList;

import java.util.LinkedList;

public class LinkedList2_add2 {
	public static void main(String args[] ){
		
		LinkedList<String> list = new LinkedList<String>();

	list.add("포도");
	list.add("딸기");
	list.add("복숭아");
	list.add(2, "키위");
	pLinkeList(list);
	
	
	list.set(0, "오렌지");
	pLinkeList(list);
	
	list.remove(1);
	pLinkeList(list);
	
	list.remove("키위");
	pLinkeList(list);

	}

	static void pLinkeList(LinkedList<String> list) {
		int cnt=0;
		System.out.println("===================");
		for(String str : list) {
			System.out.println("index= "+cnt+" 데이터 = "+str);			
		cnt++;
		}
		
		/*int num = list.size();
		 * for (int cnt = 0; cnt < num; cnt++){
		 * String str = list.get(cnt);
		 * System.out.println("index= "+cnt+" +"\t"+데이터 = "+str);
		 */
		 
	}
}
