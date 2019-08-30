package com.verinon.beans;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Monthly {
	private String firstname;
	private String lastname;
	private String phnumber;
	private String address;
	private String sonof;
	private Double amount;
	private Double interest;
	
	
	@Override
	public String toString() {
		return "Monthly [firstname=" + firstname + ", lastname=" + lastname + ", phnumber=" + phnumber + ", address="
				+ address + ", sonof=" + sonof + ", amount=" + amount + ", interest=" + interest + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSonof() {
		return sonof;
	}
	public void setSonof(String sonof) {
		this.sonof = sonof;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getInterest() {
		return interest;
	}
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	
}
