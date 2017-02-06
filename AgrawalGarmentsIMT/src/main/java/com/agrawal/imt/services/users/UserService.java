package com.agrawal.imt.services.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.imt.model.users.User;
import com.agrawal.imt.repo.users.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository _userRepository;

	public boolean createUser(User user) {
		try {
			_userRepository.save(user);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
