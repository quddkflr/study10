package ex67_Runnable_Interface_anonymous_util_function;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String args[]) {

		Consumer<String> a = i -> System.out.println(i);
		a.accept("a:람다식");

		Consumer<String> b = System.out::println;
		b.accept("b:메서드 참조 방법");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		
		list.forEach(i -> System.out.println(i)); 
		
		list.forEach(System.out::println);
			
		}

	}


