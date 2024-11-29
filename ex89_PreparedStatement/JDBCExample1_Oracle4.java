package ex89_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCExample1_Oracle4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명을 입력하세요>");
		String search = sc.nextLine();
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");
		
			String sel_where_sql = "select code, name, price, maker "
					+ "from goodsinfo "
					+ "where name= ?";
			
			pstmt = conn.prepareStatement(sel_where_sql);
			pstmt.setString(1, search);
			rs = pstmt.executeQuery();

			System.out.println("번호\t상품코드\t상품명\t가격\t제조사");
			System.out.println("----------------------------------");

			int i = 0;
			while (rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");


				System.out.printf("%d\t%-7s\t%-10s%d%5s\n",
				          ++i, code, name, price, maker);
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		if (conn != null)
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}


