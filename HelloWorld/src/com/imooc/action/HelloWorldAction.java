package com.imooc.action;


import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	private HttpServletRequest request;
	public String add(){
		return "add";
	}
	public String update(){
		return "update";
	}
	@Override
	public String execute() throws Exception {
		System.out.println("执行Action");
		return SUCCESS;
	}

	
}
