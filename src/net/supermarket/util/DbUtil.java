package net.supermarket.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DbUtil {

	private DbUtil() {
		super();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ecshop";
		String user = "root";
		String password = "";
		return DriverManager.getConnection(url, user, password);
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn, null, stmt, rs);
	}

	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		close(conn, pstmt, null, rs);
	}
	
	public static void close(Connection conn, PreparedStatement pstmt) {
		close(conn, pstmt, null, null);
	}
	public static void close(Connection conn, PreparedStatement pstmt, Statement stmt, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
