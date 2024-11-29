package ex81_select_statement_method_list_map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO {

	public List<Map<String, Object>> select() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			stmt = conn.createStatement();

			String select_sql = "select * from GoodsInfo";

			rs = stmt.executeQuery(select_sql);
		
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();

				//String code = rs.getString("code");
				map.put("code", rs.getString("code"));

				//String name = rs.getString("name");
				map.put("name", rs.getString("name"));

				//int price = rs.getInt("price");
				map.put("price", rs.getInt("price"));

				//String maker = rs.getString("maker");
				map.put("maker", rs.getString("maker"));

				list.add(map);

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
