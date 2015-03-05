package com.aavn.primefaces;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="formApplicantEmail")
@ViewScoped
public class FormApplicantEmail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ApplicantEmail applicantEmail;
	
	public FormApplicantEmail() {
		this.initialize();
	}
	
	public void initialize() {
		String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get( "id" );
        if (id != null) {
        	applicantEmail.setId(Integer.parseInt(id));
        } else 
        	applicantEmail = new ApplicantEmail();
	}

	public ApplicantEmail getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(ApplicantEmail applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	
	public String action() {
		System.out.println("applicantEmail456: " + applicantEmail.getSubject());
		return "";
	}
	
}
