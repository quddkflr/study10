package tttttttestttttt_1;

public class Rectangle implements Transformable{
	int x;
	int y;
	int width;
	int height;

	Rectangle(int x,int y,int width,int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	public void moveTo(int x,int y) {
		this.x = x;
		this.y = y;
		
	}
	public void moveBy(int xOffset,int yOffset) {
		x += xOffset;
		y += yOffset;
				
	}
	
}
