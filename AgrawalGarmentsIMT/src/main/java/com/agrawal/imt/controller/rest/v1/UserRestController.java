package com.agrawal.imt.controller.rest.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agrawal.imt.model.users.User;
import com.agrawal.imt.services.users.UserService;

@RestController
@RequestMapping(value = "user.html")
public class UserRestController {

	@Autowired
	UserService _userService;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public boolean createUser(@RequestBody User user) {
		return _userService.createUser(user);

	}
}
