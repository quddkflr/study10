package ex91;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ex90.Student3;

public class BoardDAO_seq {
	public int boardInsert(Board board) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "board", "1234");

			String sql = "insert into board " + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					+ " BOARD_CONTENT,BOARD_RE_REF," + " BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT," + " BOARD_DATE) "
					+ " values(board_seq.nextval,?,?,?," + "			?, board_seq.nextval," + "			?,?,?,"
					+ "			sysdate)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());

			pstmt.setInt(5, 0);
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);

			result = pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
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

	public List<Board> getBoardList(int page, int limit) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;

		String sql = "select *" + " from (Select rownum rnum, b.*" + " from (select * from board"
				+ " order by BOARD_RE_REF desc, BOARD_RE_SEQ asc) b" + " where rownum<=?)"
				+ " where rnum>=? and rnum<=?";

		List<Board> list = new ArrayList<Board>();
		int startrow = (page - 1) * limit + 1;
		int endrow = startrow + limit - 1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "board", "1234");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, endrow);
			pstmt.setInt(2, startrow);
			pstmt.setInt(3, endrow);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
				list.add(board);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
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
		return list;
	}

	public Board getDetail(int num) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		Board board = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "board", "1234");

			pstmt = conn.prepareStatement("select * from board where BOARD_NUM = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));

			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
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
		return board;
	}

	public int boardModify(Board modifyboard) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		String sql = "update board " + "set	 BOARD_SUBJECT= ?, " + "		 BOARD_CONTENT= ? " + "where BOARD_NUM=? ";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "board", "1234");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, modifyboard.getBOARD_SUBJECT());
			pstmt.setString(2, modifyboard.getBOARD_CONTENT());
			pstmt.setInt(3, modifyboard.getBOARD_NUM());
			result = pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardModifr() 에러: " + ex);
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

	public int boardReply(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		int re_ref = board.getBOARD_RE_REF();
		int re_lev = board.getBOARD_RE_LEV();
		int re_seq = board.getBOARD_RE_SEQ();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "board", "1234");

			conn.setAutoCommit(false);

			String sql = "update board " + "set    BOARD_RE_SEQ = BOARD_RE_SEQ + 1 " + "where  BOARD_RE_REF = ? "
					+ "and    BOARD_RE_SEQ > ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
			pstmt.executeUpdate();
			pstmt.close();

			++re_seq;
			++re_lev;

			sql = "insert into board " + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					+ " BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF," + " BOARD_RE_LEV, BOARD_RE_SEQ,"
					+ " BOARD_READCOUNT,BOARD_DATE) " + "values(board_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			pstmt.setString(5, "");
			pstmt.setInt(6, re_ref);
			pstmt.setInt(7, re_lev);
			pstmt.setInt(8, re_seq);
			pstmt.setInt(9, 0);
			result = pstmt.executeUpdate();
			conn.commit();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardReply() 에러 : " + ex);
			try {
				if (conn != null)
					conn.rollback();
			}catch (SQLException e) {
				e.printStackTrace();
			}
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

	public int boardDelete(Board board) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String board_delete_sql = 
				"delete from board "
				+"		where board_re_ref = ?"
				+"		and   board_re_lev >=?"
				+"		and   board_re_seq >=?"
				+"		and   board_re_seq <=("
				+"					nvl((select min(board_re_seq)-1"
				+"					from board "
				+"					where board_re_ref=? "
				+"					and board_re_lev=?"
				+"					and board_re_seq>?) ,"
				+ "					(select max(board_re_seq) "
				+"					from BOARD "
				+"					where board_re_ref=?))"
				+"					)";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "board", "1234");
			pstmt = conn.prepareStatement(board_delete_sql);
			pstmt.setInt(1, board.getBOARD_RE_REF());
			pstmt.setInt(2, board.getBOARD_RE_LEV());
			pstmt.setInt(3, board.getBOARD_RE_SEQ());
			pstmt.setInt(4, board.getBOARD_RE_REF());
			pstmt.setInt(5, board.getBOARD_RE_LEV());
			pstmt.setInt(6, board.getBOARD_RE_SEQ());
			pstmt.setInt(7, board.getBOARD_RE_REF());
			
			result = pstmt.executeUpdate();
				
	}
		catch (Exception ex) {
			ex.printStackTrace();
			try {
				if (conn != null)
					conn.rollback();
			}catch (SQLException e) {
				e.printStackTrace();
			}
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

	public int count() {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs =null;
		String sql = "select count(*) from board";
		int count = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(ur1, "board", "1234");
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
		
	}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("count() 에러 : " + ex);
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
		return count;
	}
}
