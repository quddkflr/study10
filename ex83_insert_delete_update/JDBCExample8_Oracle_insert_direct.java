package ex83_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample8_Oracle_insert_direct {
	public static void main(String args[]) {
		
		if(args.length != 2) {
			System.out.println("상품코드, 제조사 입력하세요");
			return;
		}
		
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");
			stmt = conn.createStatement();
			
			String single = "'";
			String up_sql = "update goodsinfo set maker = '아이리버' where code ="
			+single+args[0]+single+"and maker ="+single+args[1]+single;
			System.out.println(up_sql);

			int rowNum = stmt.executeUpdate(up_sql);
			System.out.println(rowNum + "업데이트 완");
			
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