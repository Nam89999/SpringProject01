package com.nam89999.springproject01.DTO;

import lombok.Getter;
import lombok.Setter;

public class SignUpDTO {
	private String id;
	private String password;
	private String name;// 추가 (추가해주는 이유는 뭘까?)
	private String email; // 추가

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

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return email;
	}

	public void setEamil(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}



	
	

}
