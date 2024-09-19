package com.ASR.PestKit.Model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	
	@Id
	private String email;
	private String 	name;
	private String mobile;
	private String msg;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String email, String name, String mobile, String msg) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.msg = msg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Contact [email=" + email + ", name=" + name + ", mobile=" + mobile + ", msg=" + msg + "]";
	}
	
	
	

}
