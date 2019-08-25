package com.saki209.beans;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ResetPassword {
	private String firstname;
	private String lastname;
	private String phnumber;
	private String newpassword;
	private String reenternewpassword;
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
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getReenternewpassword() {
		return reenternewpassword;
	}
	public void setReenternewpassword(String reenternewpassword) {
		this.reenternewpassword = reenternewpassword;
	}
	

}
