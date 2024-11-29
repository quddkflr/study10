package ex49_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	public static void main(String ars[]) {
		Queue<String> queue = new LinkedList<String>();
		System.out.println("비었나요? " + queue.isEmpty());
		
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호라이");
		
		System.out.println(queue.peek());
		System.out.println("비었나요? "+queue.isEmpty());
		System.out.println("갯수 = "+queue.size());
		
		System.out.println("poll() 사용");
		while(!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
		System.out.println("비었나요? " + queue.isEmpty());
	}

}
