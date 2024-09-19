package com.ASR.PestKit.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
	
	@Id
	private String email;
	private String service;
	private String name;
	private String mobile;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(String email, String service, String name, String mobile) {
		super();
		this.email = email;
		this.service = service;
		this.name = name;
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
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
	@Override
	public String toString() {
		return "Service [email=" + email + ", service=" + service + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
	

}
