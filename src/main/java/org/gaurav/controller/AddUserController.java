package org.gaurav.controller;

import org.gaurav.dto.AddUserRequest;
import org.gaurav.dto.AddUserResponse;
import org.gaurav.services.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	
	@Autowired
	AddUserService adduserservice;
	
	@PostMapping(
			path="/auth/adduser"  ,
			consumes = {"application/json" , "application/xml"},
			produces = {"application/json" , "application/xml"})
	public AddUserResponse adduser(@RequestBody AddUserRequest adduserRequest) {
		return adduserservice.adduser(adduserRequest);
	}
}
