package com.aavn.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@SessionScoped
public class UserLoginView {
	private String username;
    
    private String password;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    public void login(ActionEvent event) {
        
    }   
}
