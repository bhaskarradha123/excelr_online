package com.excelR.spring_2.model; 
import org.springframework.beans.factory.annotation.Value;
// blue prints and model class
import org.springframework.stereotype.Component;


@Component
public class Employee {
//	@Value("Radha")
	private String name;
	private String email;
	private long phone;
	private String pwd;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phone=" + phone + ", pwd=" + pwd + "]";
	}
	
	
	
	 
}
