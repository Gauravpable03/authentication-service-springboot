package org.gaurav.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse {
	
	private String Status ;
	private String message ;

	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
