package ex09_1object;

public class GoodsStock_make {
	public static void main(String args[]) {

		GoodsStock obj = new GoodsStock("52135",200);
        print(obj);
		
		obj.addStock(1000);
		System.out.println("======obj.addStock(1000); 후=====");
		print(obj);
		
		obj.subtractStock(500);
		System.out.println("======obj.subtractStock(500); 후=====");
		print(obj);
		
		
	}

	public static void print(GoodsStock obj) {
		System.out.println("상품코드:" + obj.goodsCode);
		System.out.println("재고수량:" + obj.stockNum);
		
	}
}
