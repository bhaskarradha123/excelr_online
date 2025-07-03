package com.excelR.spring_2.model;

// blue prints and model class
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // used to create table 
@Component
public class Employee {
	@Id //for primary key-- won't accepts null and duplicates
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autogenerating of id's
	private int id;
//	@Value("Radha")
	private String name;
	private String email;
	@Column(unique = true) // it will make a column as unique
	private long phone;
	private String pwd;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
