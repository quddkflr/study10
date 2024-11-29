package ex88_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample_different_insert1_PreParedStatement {
	public static void main(String args[]) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			int result = 0, count = 0;
			long start = System.currentTimeMillis();

			String sql = "insert into test(no, name) " + "values(?,?)";
			pstmt = conn.prepareStatement(sql);

			for (int i = 0; i < 10000; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "홍길동");
				result = pstmt.executeUpdate();
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
			if (pstmt != null)
				try {
					pstmt.close();
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