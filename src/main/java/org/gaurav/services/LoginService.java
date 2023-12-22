package org.gaurav.services;

import org.gaurav.dto.LoginRequest;
import org.gaurav.dto.LoginResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class LoginService {
	public LoginResponse validate(LoginRequest loginRequest) {
		
		LoginResponse response = new LoginResponse();
		
		if(loginRequest.getUsername().equalsIgnoreCase("admin") &&
				loginRequest.getPassword().equals("admin123")) {
			response.setStatus("Success");
			response.setMessage("Login Successful");
		}else {
			response.setStatus("Fail");
			response.setMessage("Login failure");
		}
		return response ;
	}

}
