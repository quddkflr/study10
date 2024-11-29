package ex89_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleSQLException;

public class JDBCExample1_Oracle8 {
	public static void main(String args[]) {
		String sql1 = "insert into goodsinfo "
				+ "values(?,?,?,?) ";
		
		String sql2 = "UPDATE goodsinfo "
				+ "set price = ? "
				+ "where code= ? ";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");
			
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, "10006");
			pstmt.setString(2, "공기청정기");
			pstmt.setInt(3, 500000);
			pstmt.setString(4, "코웨이");
			int result1 = pstmt.executeUpdate();
			pstmt.close();
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, 100);			
			pstmt.setString(2, "10001");			
			int result2 = pstmt.executeUpdate();
			pstmt.close();
			
			if(result1==1 && result2==1) {
				conn.commit();
				System.out.println("db에 반영됨 . . . . . .");
			}else {
				conn.rollback();
				System.out.println("db 반영이 취소 됨 .....");
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			try {
			System.out.println(se.getMessage());
					conn.rollback();
					System.out.println("db 반영이 취소 됨2. .. .. . ");
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {				
		}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
	}
}
