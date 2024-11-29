package ex90;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {
	public int insert(Student3 student3) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		String sql = "insert into student(no, name, kor, math, eng, tot, avg, grade) "
				+ "values(student_seq.nextval, ?, ?, ?, ?, ?, ?, "
				+ "			(select grade from hakjum where ? between lowscore and hiscore)" + "			)";
		int result = 0;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, student3.getName());
			pstmt.setInt(2, student3.getKor());
			pstmt.setInt(3, student3.getMath());
			pstmt.setInt(4, student3.getEng());
			pstmt.setInt(5, student3.getTot());
			pstmt.setFloat(6, student3.getAvg());
			pstmt.setFloat(7, student3.getAvg());

			result = pstmt.executeUpdate();
			System.out.println("db에 반영됨 . . . . . .");

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
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		return result;
	}

	public ArrayList<Student3> selectAll() {
		ArrayList<Student3> list = new ArrayList<Student3>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			stmt = conn.createStatement();

			String select_sql = "select * from student order by no";
			rs = stmt.executeQuery(select_sql);
			while (rs.next()) {
				Student3 st = new Student3();
				st.setNo(rs.getInt("no"));
				st.setName(rs.getString("name"));
				st.setKor(rs.getInt("kor"));
				st.setMath(rs.getInt("math"));
				st.setEng(rs.getInt("eng"));
				st.setTot(rs.getInt("tot"));
				st.setAvg(rs.getFloat("avg"));
				st.setGrade(rs.getString("grade"));
				list.add(st);
			}

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
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		return list;
	}

	public Student3 select(int no) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String sql = "select * from student where no = ?";

		Student3 st = null;

		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				st = new Student3();
				st.setNo(rs.getInt("no"));
				st.setName(rs.getString("name"));
				st.setKor(rs.getInt("kor"));
				st.setMath(rs.getInt("math"));
				st.setEng(rs.getInt("eng"));
				st.setTot(rs.getInt("tot"));
				st.setAvg(rs.getFloat("avg"));
				st.setGrade(rs.getString("grade"));
			}

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
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		return st;
	}

	public int update(Student3 student3) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		String sql = "update student set name= ?, kor = ?, math = ?, eng = ? , tot = ?, avg = ?,"
				+ " grade =(select grade from hakjum where ? between lowscore and hiscore) " + " where no = ? ";
		int result = -1;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, student3.getName());
			pstmt.setInt(2, student3.getKor());
			pstmt.setInt(3, student3.getMath());
			pstmt.setInt(4, student3.getEng());
			pstmt.setInt(5, student3.getTot());
			pstmt.setFloat(6, student3.getAvg());
			pstmt.setFloat(7, student3.getAvg());
			pstmt.setInt(8, student3.getNo());

			result = pstmt.executeUpdate();

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
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		return result;
	}

	public int delete(int no) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		String sql = "delete from student where no= ? ";
		int result = -1;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "scott", "tiger");

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);

			result = pstmt.executeUpdate();

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
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		return result;
	}
}
