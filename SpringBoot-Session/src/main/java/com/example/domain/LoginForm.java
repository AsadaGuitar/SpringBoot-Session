package com.example.domain;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class LoginForm {

	@NotEmpty
	private String name;
	
	@NotEmpty
	private String msg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
