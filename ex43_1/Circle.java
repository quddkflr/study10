package ex43_1;

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
			Circle c = (Circle)super.clone();
			c.p = new Point(this.p.x, this.p.y);
			return c;
			
			
		}
		catch (CloneNotSupportedException e) {
			System.out.println("복제 오류 발생했습니다.");
			return null;
		}
	}
		public String toString() {
			return "[p="+p+", r="+ r +"]" ;
		}
		
	}


