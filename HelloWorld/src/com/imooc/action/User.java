package com.imooc.action;

import java.util.List;

public class User {

	private String username;
	private String password;
	private List<User> bookList;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<User> getBookList() {
		return bookList;
	}
	public void setBookList(List<User> bookList) {
		this.bookList = bookList;
	}
	
	
}
