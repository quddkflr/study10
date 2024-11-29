package ex30_access;

class PlainLabel implements Movable{
	int x,y;
	String str;
	PlainLabel(int x, int y, String str){
		this.x = x;
		this.y = y;
		this.str = str;
		
	}	
	public void mobeTo(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

		
	}


