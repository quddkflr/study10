package ex41;

public class Circle2 {
	int radius;
	Circle2(int radius){
		this.radius = radius;
	}
	public String toString() {
		return "radius=" + radius;
}
	public boolean equals(Object obj) {
				
		if (obj !=null && obj instanceof Circle2) {
			Circle2 obj2 = (Circle2)obj;
			return this.radius == obj2.radius;
		}else {
			return false;
		}
		
	}

}