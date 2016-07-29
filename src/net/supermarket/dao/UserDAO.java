package net.supermarket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import net.supermarket.model.User;
import net.supermarket.util.DbUtil;

public class UserDAO implements IUserDAO{

	@Override
	public boolean save(User pojo) throws Exception {
		String sql = "INSERT INTO `ecs_admin_user`(`user_name`,`email`,`password`,`add_time`,`last_login`,`last_ip`,`action_list`,`role_id`) VALUES(?,?,?,?,?,?,?,?)";
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, pojo.getUser_name());
		pstmt.setString(2, pojo.getEmail());
		pstmt.setString(3, pojo.getPassword());
		pstmt.setInt(4, pojo.getAdd_time());
		pstmt.setInt(5, pojo.getLast_login());
		pstmt.setString(6, pojo.getLast_ip());
		pstmt.setString(7, pojo.getAction_list());
		pstmt.setInt(8, pojo.getRole_id());
		int flag = pstmt.executeUpdate();
		DbUtil.close(conn, pstmt);
		return flag > 0 ? true : false;
	}

	@Override
	public ArrayList<User> getUserList() throws Exception {
		return null;
	}

	@Override
	public User findUserById(int uid) throws Exception {
		return null;
	}
}
