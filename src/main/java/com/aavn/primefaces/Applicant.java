package com.aavn.primefaces;

import java.util.Date;

public class Applicant {
	private int id;
	private String firstName;
	private String lastName;
	private Integer gender;
	private String email;
	private Date dateOfBirth;
	private String skypeAccount;
	private String phoneNumber;
	private Integer event;
	private Boolean isFresher;
	private String major;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date birthday) {
		this.dateOfBirth = birthday;
	}
	public String getSkypeAccount() {
		return skypeAccount;
	}
	public void setSkypeAccount(String skypeAccount) {
		this.skypeAccount = skypeAccount;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getEvent() {
		return event;
	}
	public void setEvent(Integer event) {
		this.event = event;
	}
	

}
