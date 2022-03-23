package com.learn4u.microservice3;

import org.springframework.stereotype.Component;

@Component
public class PolicyBean {

	private String message;
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
