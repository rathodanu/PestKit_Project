package com.ASR.PestKit.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserSignup {
	
	@Id
	private String email;
	
	public UserSignup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSignup(String email, String name) {
		super();
		this.email = email;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserSignup [email=" + email + "]";
	}
	
	
	
	
	

}
