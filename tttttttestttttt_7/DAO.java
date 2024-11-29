package tttttttestttttt_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {

	public List<GoodsInfo> select() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<GoodsInfo> list = new ArrayList<GoodsInfo>();
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			stmt = conn.createStatement();

			String select_sql = "select * from GoodsInfo";

			rs = stmt.executeQuery(select_sql);

			System.out.println("번호\t상품코드\t상품명\t가격\t제조사");
			System.out.println("--------------------------------------------------------");

			int i = 0;
			while (rs.next()) {
				GoodsInfo g = new GoodsInfo();

				String code = rs.getString("code");
				g.setCode(code);

				String name = rs.getString("name");
				g.setName(name);

				int price = rs.getInt("price");
				g.setPrice(price);

				String maker = rs.getString("maker");
				g.setMaker(maker);

				list.add(g);

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
		return list;
	}
}
