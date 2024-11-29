package ex43;

import ex42_clone1_2.Rectangle;

public class Circle implements Cloneable{
	Point p;
	double r;
	
	public Circle(Point p , double r) {
		this.p = p;
		this.r = r;
	}
	public Circle clone() {
		try {
			return (Circle) super.clone();
		}
		catch (CloneNotSupportedException e) {
			System.out.println("복제 오류 발생했습니다.");
			return null;
		}
	}
		public String toString() {
			return "[p="+p+","+ " r="+ r +"]" ;
		}
		
	}


