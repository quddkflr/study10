package ex87;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import ex84.Emp;

public class DAO {

	public ArrayList<Emp> search(int j, String search_word) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Emp> list = new ArrayList<Emp>();
		String[] whereCondition = { "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"};
		String single = "'";
		String where = "";
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			stmt = conn.createStatement();

			switch(j) {
			case 0 -> where += "where " + whereCondition[j] + " = "  + search_word;
			case 1 -> where += "where " + whereCondition[j] + " = "  + single + search_word + single;
			case 2 -> where += "where " + whereCondition[j] + " = "  + single + search_word + single;
			case 3 -> where += "where " + whereCondition[j] + " = "  + search_word;
			case 4 -> where += "where " + whereCondition[j] + " = "  + search_word;
			case 5 -> where += "where " + whereCondition[j] + " = "  + single + search_word + single;
			case 6 -> where += "where " + whereCondition[j] + " = "  + single + search_word + single;
			case 7 -> where += "where " + whereCondition[j] + " = "  + single + search_word + single;
						
			}
			
			String select_sql = "select * from emp " + where;

			rs = stmt.executeQuery(select_sql);

			int i = 0;
			while (rs.next()) {
				Emp a = new Emp();

				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				a.setEmpno(empno);
				a.setEname(ename);
				a.setJob(job);
				a.setMgr(mgr);
				a.setHiredate(hiredate);
				a.setSal(sal);
				a.setComm(comm);
				a.setDeptno(deptno);
				
				list.add(a);

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
		return list;
	}
}
