package org.gaurav.services;

import org.gaurav.dto.AddUserRequest;
import org.gaurav.dto.AddUserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class AddUserService {
	@PostMapping(path="/auth/adduser")
	public AddUserResponse adduser(AddUserRequest adduserRequest) {
		AddUserResponse response = new AddUserResponse();
		response.setStatus("success");
		response.setMessage("User Successfully added");
		response.setUser_Id(adduserRequest.getUser_Id());
		response.setUser_name(adduserRequest.getUser_name());
		response.setUser_email(adduserRequest.getUser_email());
		response.setUser_age(adduserRequest.getUser_age());
		return response;
	}

}
