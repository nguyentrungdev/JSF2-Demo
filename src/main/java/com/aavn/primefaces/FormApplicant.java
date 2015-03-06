package com.aavn.primefaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.aavn.primefaces.domain.Gender;

@ManagedBean(name="formApplicant")
@ViewScoped
public class FormApplicant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Applicant applicant;
	
	public FormApplicant() {
		String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
		System.out.println("id" + id);
        if (id != null) {
        	applicant = new Applicant();
        	applicant.setId(Integer.parseInt(id));
        	if (id.equals("7"))
        		applicant.setFirstName("Nguyễn Văn A");
        } else 
        	applicant = new Applicant();
	}
	
	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	
	public String submit() {
		System.out.println("applicant: " + applicant.getFirstName());
		System.out.println("applicant: " + applicant.getLastName());
		applicant.setId(2);
		return "";
	}
	
	public Gender[] getGenders() {
		return Gender.values();
	}
}
