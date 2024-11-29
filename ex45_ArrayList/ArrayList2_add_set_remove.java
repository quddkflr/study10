package ex45_ArrayList;

import java.util.ArrayList;

public class ArrayList2_add_set_remove {
	public static void main(String args[] ){
	
	ArrayList<String> list = new ArrayList<String>();

	list.add("포도");
	list.add("딸기");
	list.add("복숭아");
	pArrayList(list);
	
	list.add(2, "키위");
	pArrayList(list);

	list.add(4, "키위");
	pArrayList(list);
	
	list.set(0, "오렌지");
	pArrayList(list);
	
	list.remove(1);
	pArrayList(list);
	
	list.remove("키위");
	pArrayList(list);

	}

	static void pArrayList(ArrayList<String> list) {
		int cnt=0;
		for(String str : list) {
			//System.out.println("index= "+cnt+" data = "+str);
			System.out.printf("index = %d data = %s\n",cnt,str);
		cnt++;
		}
		System.out.println("===================");
		
		
	}
}
