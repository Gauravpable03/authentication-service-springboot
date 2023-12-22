package org.gaurav.controller;

import org.gaurav.dto.LoginRequest;
import org.gaurav.dto.LoginResponse;
import org.gaurav.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService ;
	
	@PostMapping(path="/auth/validate" ,
		consumes = {"application/json","application/xml"},
		produces = {"application/json","application/xml"})
	public LoginResponse validate(@RequestBody LoginRequest loginRequest)
	{
		return loginService.validate(loginRequest);
	}

}
