package com.morogoyodesings.CRM.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class CustomerInfo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="fName")
	private String fName;
	@Column(name= "lName")
	private String lName;
	@Column(name= "gender")
	private String gender;
	@Column(name= "address")
	private String address;
	@Column(name= "email")
	private String email;
	@Column(name= "birthday")
	private Date birthday;
	@Column(name= "profession")
	private String profession;
	@Column(name= "mobileNumber")
	private String mobileNumber;
	public CustomerInfo() {
		
	}
	
	
	public CustomerInfo(Long id, String fName, String lName, String gender, String address, String email, Date birthday,
			String profession, String mobileNumber) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.birthday = birthday;
		this.profession = profession;
		this.mobileNumber = mobileNumber;
	}
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getEmail() {
		return email;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getProfession() {
		return profession;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	

}
