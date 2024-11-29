package ex37_Random;

import java.util.Random;

class RandomExample1{
	public static void main(String args[]) {
		Random random = new Random();
		
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		
		System.out.println("1~45까지의 난수 발생 : " + (random.nextInt(45)+1));
		
		for(int i=0;i<6;i++) {
			System.out.print((random.nextInt(45)+1) + "\t");
		}
	}
}