package com.aavn.primefaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped
public class Calculator implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double result;

	public double getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result; 
	}

	public void add(ActionEvent event) {
		if (event.getComponent().getAttributes().get("number") != null && !event.getComponent().getAttributes().get("number").toString().isEmpty()) {
			float number = Float.parseFloat(event.getComponent().getAttributes().get("number").toString());
			this.result += number;
		}
	}
	
	public Calculator() {
		System.out.println("$$$$$$$$$$$$$$$$-new Calculator-$$$$$$$$$$$$$$$$");
	}
}
