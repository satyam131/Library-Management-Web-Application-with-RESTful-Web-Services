package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Users {
	
	String uname;

	String pass;

	@Override
	public String toString() {
		return "Users [uname=" + uname + ", pass=" + pass + "]";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
