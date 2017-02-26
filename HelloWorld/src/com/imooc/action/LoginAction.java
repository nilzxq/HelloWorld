package com.imooc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user=new User();
	private String login(){
		System.out.println(user.getUsername());
		System.out.println(user.getBookList().get(0).getUsername());
		System.out.println(user.getBookList().get(1).getUsername());
		//....
		
		return SUCCESS;
	}
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	

}
