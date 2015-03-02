package com.aavn.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(eager=true)
@ViewScoped
public class Calculator {
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
	
}
