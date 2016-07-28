package net.supermarket.model;

public class User {
	private short user_id;
	private String user_name;
	private String email;
	private String password;
	private int add_time;
	private int last_login;
	private String last_ip;
	private String action_list;
	private short role_id;

	public short getUser_id() {
		return user_id;
	}

	public void setUser_id(short user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdd_time() {
		return add_time;
	}

	public void setAdd_time(int add_time) {
		this.add_time = add_time;
	}

	public int getLast_login() {
		return last_login;
	}

	public void setLast_login(int last_login) {
		this.last_login = last_login;
	}

	public String getLast_ip() {
		return last_ip;
	}

	public void setLast_ip(String last_ip) {
		this.last_ip = last_ip;
	}

	public String getAction_list() {
		return action_list;
	}

	public void setAction_list(String action_list) {
		this.action_list = action_list;
	}

	public short getRole_id() {
		return role_id;
	}

	public void setRole_id(short role_id) {
		this.role_id = role_id;
	}

}
