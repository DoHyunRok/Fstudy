package kr.co.fstudy.UserDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

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
	private final String join = "insert into user (id,password,nickname,age) values (?,?,?,?)";
	
	public int RegisterUser(HttpServletRequest req) {
		
		try {
			conn = Getconnetion();
			pstmt = conn.prepareStatement(join);
			pstmt.setString(1, req.getParameter("id"));
			pstmt.setString(2, req.getParameter("pw"));
			pstmt.setString(3, req.getParameter("nickname"));
			pstmt.setString(4,req.getParameter("age"));
			int result = pstmt.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -2;
	}
}
