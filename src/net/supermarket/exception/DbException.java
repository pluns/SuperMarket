package net.supermarket.exception;

public class DbException extends Exception {

	private static final long serialVersionUID = 80667428625115874L;
	private String message;

	public DbException(String message) {
		super();
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
