package tttttttestttttt_7;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<GoodsInfo> list = dao.select();//List<GoodsInfo>
		
		System.out.println("번호\t상품코드\t상품명\t\t가격\t제조사");
		System.out.println("--------------------------------------------------------");
        int no=1; 
		for(GoodsInfo g : list) {
			System.out.println(no++ + "\t" +  g.toString());
		}
	}
}


