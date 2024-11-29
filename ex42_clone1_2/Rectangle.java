package ex42_clone1_2;

public class Rectangle implements Cloneable {
		int width, height;

		Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		public Rectangle clone() {
			try {
				return (Rectangle) super.clone();
			}
			catch (CloneNotSupportedException e) {
				return null;
			}
		}
		
		public String toString() {
			String result = "가로는 "+width + ", 세로는 "+height;
			return result;
		}

		public boolean equals(Object obj) {
			if (obj instanceof Rectangle == true && obj != null) {
				Rectangle obj2 = (Rectangle) obj;

				return this.width == obj2.width && this.height == obj2.height; 
			} else {
				return false;
			}

		}
		
	}


