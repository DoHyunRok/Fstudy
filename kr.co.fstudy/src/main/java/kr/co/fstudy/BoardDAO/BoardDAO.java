package kr.co.fstudy.BoardDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import kr.co.fstudy.BoardVO.BoardVO;
@Repository
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	

	public static Connection Getconnetion() {
		Connection conn = null;
		String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/fpj";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
			try {
				if (rs != null) {
				rs.close();
			}
				if(pstmt != null&& conn !=null) {
					pstmt.close();
					conn.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
				pstmt = null;
				conn = null;
			}
	}
	private final String writeboard = "insert into board(title,content,category,categorysub) value(?,?,?,?)";
	
	public int writeboard(HttpServletRequest req) {
		int result = 0;
		String title = req.getParameter("title");
		System.out.println(title);
		String content = req.getParameter("content");
		System.out.println(content);
		String category = req.getParameter("category");
		String categorysub = req.getParameter("categorysub");
		System.out.println(category);
		try {
			conn = Getconnetion();
			pstmt = conn.prepareStatement(writeboard);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, category);
			pstmt.setString(4, categorysub);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs,pstmt,conn);
		}
		return result;
	}
	private final String getboard ="select * from board where category=?";
	private final String getsubboard ="select * from board where categorysub=?";
	
	public ArrayList<BoardVO> getboard(HttpServletRequest req) {
		ArrayList<BoardVO> Board = new ArrayList<BoardVO>();
		String type = req.getParameter("type");
		try {
			conn = Getconnetion();
			pstmt = conn.prepareStatement(getboard);
			pstmt.setString(1, type);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8),rs.getString(9)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
		}
		return Board;
	}
	
	public ArrayList<BoardVO> getsubboard(HttpServletRequest req) {
		ArrayList<BoardVO> Board = new ArrayList<BoardVO>();
		String subtype = req.getParameter("subtype");
		System.out.println(subtype);
		try {
			conn = Getconnetion();
			pstmt = conn.prepareStatement(getsubboard);
			pstmt.setString(1,subtype);
			System.out.println(pstmt);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8),rs.getString(9)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			rs = null;
			pstmt = null;
			conn = null;
		}
		return Board;
	}
}
