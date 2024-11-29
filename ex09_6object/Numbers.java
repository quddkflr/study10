package ex09_6object;

public class Numbers {
	
	private int num[];
	
	Numbers(int num[]){
		this.num = num;
		
	}
	int getTotal() {
		int hap = 0;
		/*
		 for (int cnt = 0; cnt < num.length; cnt++)
		      hap += num[cnt];
		 */
		for(int n : num) {
			hap += n;
		}
		return hap;
						
	}
	int getAverage() {
		return (getTotal() / num.length);
	}
}
