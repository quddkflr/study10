package ex09_7object;

public class Accumulator {
	int total = 0;
	static int grandTotal = 0;
	
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
static int getGrandTotal() {
	//total = 5;              //에러 발생
	//accumulate(100);        //에러 발생
	return grandTotal;
}
}
