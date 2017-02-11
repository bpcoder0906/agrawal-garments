package com.agrawal.imt.services.users;

import java.util.Iterator;

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
	
	public boolean findUser(User user){
		try {
			Iterable<User> results=_userRepository.findAll();
			
			Iterator<User> iter = results.iterator();
			while(iter.hasNext()){
				User usr=iter.next();
				if(usr.getUserName().equals(user.getUserName()) && usr.getPassword().equals(user.getPassword())){
					return true;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return false;
	}
	
	

}
