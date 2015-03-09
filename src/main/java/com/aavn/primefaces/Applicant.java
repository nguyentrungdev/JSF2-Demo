package com.aavn.primefaces;

import java.util.Date;

public class Applicant {
	private int id;
	private String firstName;
	private String lastName;
	private Integer gender;
	private String email;
	private Date birthday;
	private String skypeAccount;
	private String phoneNumber;
	private Integer event;
	private Boolean isFresher;
	private String major;
	private String university;
	private String skills;
	
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
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	public Boolean getIsFresher() {
		return isFresher;
	}
	public void setIsFresher(Boolean isFresher) {
		this.isFresher = isFresher;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
}
