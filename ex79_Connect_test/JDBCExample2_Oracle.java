package ex79_Connect_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2_Oracle {
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			stmt = conn.createStatement();

			String select_sql = "select * from dept";

			rs = stmt.executeQuery(select_sql);

			System.out.println("번호\t부서번호\t부서명\t\t지역");
			System.out.println("--------------------------------------------------------");

			int i = 0;
			while (rs.next()) {
				int deptno = rs.getInt("deptno");

				String dname = rs.getString("dname");

				String loc = rs.getString("loc");

				System.out.printf("%5d\t%5d\t%-15s%s\n", ++i, deptno, dname, loc);
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
