package com.aavn.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "applicantEmail", eager = true)
@SessionScoped
public class ApplicantEmailController {
	private int id;
	private String subject;
	private String applicantName;
	
	private String outcome = "form";
	
	public String getHelloWorld() {
		return "Xin chào thế giới!";
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
		return "Your subject: " + this.subject;
	}
	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	
}
