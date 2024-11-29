package ex29_main;

import ex29_geometry.shape.Square;

public class Main {
	public static void main(String[] args) {
		
		Square obj = new Square(100,200,15);
		
      for(int a = 0 ; a<4;  a++) {
    	  System.out.println("X["+a+"]="+obj.getX(a)+",Y["+a+"]="+obj.getY(a));
    	  
      }
      for(int a = 0 ; a<4;  a++)
      System.out.println("("+obj.getX(a)+","+obj.getY(a)+")");
    	  
	}
}
