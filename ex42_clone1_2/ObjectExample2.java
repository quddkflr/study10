package ex42_clone1_2;

class ObjectExample2 {
	public static void main(String args[]) {
		
		Rectangle obj1 = new Rectangle(10, 20);
		
		Rectangle obj2 =  obj1.clone();
		
		System.out.println("obj1 [" + obj1 + "]");
		System.out.println("obj1 [" + obj2 + "]");
		
		obj1.width = 300;
		obj1.height = 50;
		System.out.println("obj1 [" + obj1 + "]");
		System.out.println("obj1 [" + obj2 + "]");
		
	}

}
