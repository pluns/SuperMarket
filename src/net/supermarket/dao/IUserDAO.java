package net.supermarket.dao;

import java.util.ArrayList;

import net.supermarket.model.User;

public interface IUserDAO {
	boolean save(User pojo) throws Exception;
	ArrayList<User> getUserList() throws Exception;
	User findUserById(int uid) throws Exception;
}
