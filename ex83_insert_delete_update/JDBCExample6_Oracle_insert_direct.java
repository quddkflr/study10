package ex83_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample6_Oracle_insert_direct {
	public static void main(String args[]) {
		
		if(args.length != 4) {
			System.out.println("상품코드 상품명 가격 제조사를 입력하세요");
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
			String sql = "insert into goodsinfo values("
			+single+args[0]+single+", "
			+single+args[1]+single+", "
			+		args[2]+	   ", "
			+single+args[3]+single+")";

			System.out.println(sql);

			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "행이 추가되었습니다.");
			
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