package ex24_08_enum_need;

public class Main {
	public static void main(String args[]) {
		ClothingInfo obj=
				new ClothingInfo("32919","반팔 티셔츠","면100%",ClothingInfo.SUMMER);
			print(obj);	
				
	}
      static void print(ClothingInfo obj) {
			System.out.println("상품코드:"+obj.code);
			System.out.println("상품명:"+obj.name);
			System.out.println("소재:"+obj.material);				
			System.out.println("계절구분:"+obj.season);
      }
}
