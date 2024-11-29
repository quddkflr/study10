package ex89_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample1_Oracle6 {
	public static void main(String args[]) {			
		if(args.length != 1) {
			System.out.println("상품코드 입력하세요");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");
			
			String del_sql = "delete "
					+ "from goodsinfo "
					+ "where code= ?";
			
			pstmt = conn.prepareStatement(del_sql);
			pstmt.setString(1, args[0]);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 삭제 되었습니다.");
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {				
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
