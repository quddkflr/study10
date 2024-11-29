package ex79_Connect_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1_Oracle {
	public static void main(String args[]) {
		Connection conn = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			System.out.println("데이터베이스에 접속했습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
	}
}

