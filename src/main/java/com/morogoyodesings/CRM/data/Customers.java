package com.morogoyodesings.CRM.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "f_name")
	private String fName;
	@Column(name = "l_name")
	private String lName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "address")
	private String address;
	@Column(name = "email")
	private String email;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "profession")
	private String profession;
	@Column(name = "mobile_number")
	private String mobileNumber;

	public Customers() {
		super();
	}

	public Customers(Integer id, String fName, String lName, String gender, String address, String email, Date birthday,
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

	public String getGender() {
		return gender;
	}

	public Integer getId() {
		return id;
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

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setId(Integer id) {
		this.id = id;
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
