package com.nam89999.springproject01.DTO;

import lombok.Getter;
import lombok.Setter;

public class SignUpDTO {
    private String id;
    private String password;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
