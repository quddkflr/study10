package ex46_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3_iterator {
	public static void main(String args[] ){
		
		LinkedList<String> list = new LinkedList<String>();

	list.add("망고");
	list.add("파인애플");
	list.add("바나나");
	
	Iterator<String> iterator = list.iterator();
	
	while (iterator.hasNext()) {//현재 위치에서 다음 데이터가 있는지 확인하는 메소드
		String str = iterator.next();
		System.out.println(str);
	}
	}
}
