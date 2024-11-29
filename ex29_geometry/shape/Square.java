package ex29_geometry.shape;

import ex29_geometry.common.Polygon;

public class Square extends Polygon {
	
	public Square(int x,int y,int s) {
		super(4); 
		setPoint(0, x, y);
		setPoint(1, x + s,y);
		setPoint(2, x + s,y + s);
		setPoint(3, x,y + s);
	}
	public int getX(int index) {
		return x[index];
	}
	public int getY(int index) {
		return y[index];
	}
}
