package ex80;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDNCExample4_Oracle_where_input {
	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("상품명 입력하세요");
			String str = sc.nextLine();
				
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");
			stmt = conn.createStatement();

			String select_sql = "select code,name,price,maker "
								+ "from goodsinfo " 
								+ "where name= '" + str + "'";

			rs = stmt.executeQuery(select_sql+"\n");

			System.out.println("번호\t상품코드\t상품명\t가격\t제조사");
			System.out.println("----------------------------------");

			int i = 0;
			while (rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");

				System.out.printf("%d\t%-7s\t%-10s%d%5s\n", ++i, code, name, price, maker);
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
		if (stmt != null)
			try {
				stmt.close();
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

