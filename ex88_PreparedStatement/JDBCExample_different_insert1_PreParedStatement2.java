package ex88_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample_different_insert1_PreParedStatement2 {
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			int result = 0, count = 0;
			
			long start = System.currentTimeMillis();
			stmt = conn.createStatement();
					
			for (int i = 0; i < 10000; i++) {
				String sql = "insert into test(no, name) "
							+ "values(" + i + ",'홍길동')";
				
				result = stmt.executeUpdate(sql);
				count += result;
			}
			long end = System.currentTimeMillis();

			System.out.println("소요시간:" + (end - start) + "ms");
			if (count == 10000)
				System.out.println("삽입 완료");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		if (conn != null)
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}