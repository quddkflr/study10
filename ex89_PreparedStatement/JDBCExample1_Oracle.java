package ex89_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample1_Oracle {
	public static void main(String args[]) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");
		
			String select_sql = "select * from dept";
			
			pstmt = conn.prepareStatement(select_sql);
			rs = pstmt.executeQuery();

			System.out.println("번호\t부서번호\t부서명\t\t지역");
			System.out.println("--------------------------------------------------------");

			int i = 0;
			while (rs.next()) {
				int deptno = rs.getInt(1);

				String dname = rs.getString(2);

				String loc = rs.getString(3);

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


