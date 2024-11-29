package ex75_Serialization_error;

public class GoodsStock implements java.io.Serializable{
	private String code;
	private int num;

	GoodsStock(String code, int num) {
		this.code = code;
		this.num = num;

	}

	public void addStock(int num) {
		this.num += num;

	}

	int subtractStock(int num) throws Exception {

		if (this.num < num)
			throw new Exception("재고가 부족합니다.");
		this.num -= num;
		return num;
	}

	public String toString() {
		return "상품코드:" + code + "\t상품수량:" + num;
	}
}
