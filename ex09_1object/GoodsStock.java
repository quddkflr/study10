package ex09_1object;

public class GoodsStock {
	String goodsCode;
	int stockNum;

	GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;

	}

	public void addStock(int amount) {// 재고를 더한다 기능에 해당하는 메소드
		stockNum += amount;

	}

	int subtractStock(int amount) {// 재고를 뺀다 기능에 해당하는 메소드
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}
}