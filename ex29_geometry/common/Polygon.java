package ex29_geometry.common;
public class Polygon {
	public int[] x;
	protected int[] y;

	protected Polygon(int num) {
		x = new int[num];
		y = new int[num];
	}
	
protected void setPoint(int index,int x,int y) {
	this.x[index]=x;
	this.y[index]=y;
}
}

	

