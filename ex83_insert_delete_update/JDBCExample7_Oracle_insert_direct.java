package ex83_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample7_Oracle_insert_direct {
	public static void main(String args[]) {
		
		if(args.length != 1) {
			System.out.println("상품코드를 입력하세요");
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
			String del_sql = "delete from goodsinfo where code ="
			+single+args[0]+single;
			System.out.println(del_sql);

			int rowNum = stmt.executeUpdate(del_sql);
			System.out.println(rowNum + "행이 삭제 되었습니다.");
			
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