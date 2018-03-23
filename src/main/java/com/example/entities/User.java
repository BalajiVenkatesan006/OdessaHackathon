package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String mobileNumber;
	private String fullName;
	private String password;
	private String confirmPassword;
	private String email;
	private String address;
	public User() {
	}
	public User(String fullName, String password, String confirmPassword, String email,
			String mobileNumber, String address) {
		this.fullName = fullName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [mobileNumber=" + mobileNumber + ", fullName=" + fullName + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
