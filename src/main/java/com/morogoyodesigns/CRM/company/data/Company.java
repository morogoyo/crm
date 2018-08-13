package com.morogoyodesigns.CRM.company.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "company_name")
	private String companyName;
	
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "company_phone_number")
	private Integer companyPhoneNumber;
	
	@Column(name = "date_added")
	private Date dateAdded;
	
	@Column(name = "date_updated")
	private Date dateUpdated;

    public Company() {
    }
    
    

	public Company(Integer id, String companyName, String address, String email, String description,
			Integer companyPhoneNumber, Date dateAdded, Date dateUpdated) {
		this.id = id;
		this.companyName = companyName;
		this.address = address;
		this.email = email;
		this.description = description;
		this.companyPhoneNumber = companyPhoneNumber;
		this.dateAdded = dateAdded;
		this.dateUpdated = dateUpdated;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(Integer companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}



	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", address=" + address + ", email=" + email
				+ ", description=" + description + ", companyPhoneNumber=" + companyPhoneNumber + ", dateAdded="
				+ dateAdded + ", dateUpdated=" + dateUpdated + "]";
	}

    
}
