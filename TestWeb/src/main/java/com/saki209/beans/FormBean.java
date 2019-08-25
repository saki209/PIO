package com.saki209.beans;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FormBean {
	private String firstname;
	private String lastname;
	private String phnumber;
	private String password;
	private String reenter;
	
	public FormBean() {
		System.out.println("formbean is created");
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReenter() {
		return reenter;
	}
	public void setReenter(String reenter) {
		this.reenter = reenter;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

}
