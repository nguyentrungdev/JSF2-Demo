package com.aavn.primefaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "applicantEmail", eager = true)
@SessionScoped
public class ApplicantEmailController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String subject;
	private String applicantName;
	
	public String getHelloWorld() {
		return "Hello world!";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	public String action() {
		this.subject = "Your subject: " + this.subject;
		return "";
	}
	
	public ApplicantEmailController() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$-New ApplicantionEmailController-$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}
