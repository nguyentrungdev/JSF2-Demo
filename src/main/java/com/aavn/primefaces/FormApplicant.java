package com.aavn.primefaces;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.application.Application;
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
        	if (id.equals("7")) {
        		applicant.setFirstName("Nguyễn Văn A");
        		applicant.setBirthday(new Date());
        	}
        } else 
        	applicant = new Applicant();
	}
	
	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	
	public void setGraduateTime(int input) {
		if (input > 0) {
			if (input < 1000)
				applicant.setYearOfExperience(input);
			else if (input/1000 >= 1 && input/1000 <= 10) {
				Calendar calendar = Calendar.getInstance();
				calendar.set(Calendar.YEAR, input);
				applicant.setGraduateTime(calendar.getTime());
			}
		}
	}
	
	public Integer getGraduateTime() {
		if (applicant.getYearOfExperience() > 0)
			return applicant.getYearOfExperience();
		if (applicant.getGraduateTime() != null) {
			//return applicant.getGraduateTime().getYear() + 1900;
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(applicant.getGraduateTime());
			return calendar.get(Calendar.YEAR);
		}
		return null;
	}
	
	public String submit() {
		applicant.setId(2); //assuming that we'd saved it to db and have the id
		return "";
	}
	
	public Gender[] getGenders() {
		return Gender.values();
	}
	
	public List<Skill> getSkills() {
		System.out.println("get skills");
		return Skill.getSkills();
	}
}
