package cn.ybzy.model;

import java.util.Arrays;

public class User {
	private String username;
	private String pasword;
	private String[] hobby;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public User() {
		super();
	}

	public User(String username, String pasword, String[] hobby) {
		super();
		this.username = username;
		this.pasword = pasword;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", pasword=" + pasword + ", hobby=" + Arrays.toString(hobby) + "]";
	}

}
