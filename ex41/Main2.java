package ex41;

public class Main2 {
	public static void main(String args[]) {
		Circle2 obj1 = new Circle2(15);
		Circle2 obj2 = new Circle2(5);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.equals(obj2));
		
		if(obj1.equals(obj2))
			System.out.println("obj1.equals(obj2) : 같음");
		else
			System.out.println("obj1.equals(obj2) : 다름");
		
		if(obj1==obj2)
			System.out.println("obj1=obj2 : 같음");
		else
			System.out.println("obj1=obj2 : 다름");
		
		
		}
	
}
