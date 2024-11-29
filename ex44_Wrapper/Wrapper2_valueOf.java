package ex44_Wrapper;

public class Wrapper2_valueOf {
	public static void main(String args[]) {
		
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);
		
		if(obj1==obj2)
			System.out.println("obj1==obj2");
		else
		System.out.println("obj1==obj2");
		
		
		if(obj1.equals(obj2))
		System.out.println("obj1.equals(obj2) 같아요");
		else
		System.out.println("obj1.equals(obj2) 달라요");
		
	}

}

