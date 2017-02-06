package com.agrawal.imt.repo.users;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.agrawal.imt.model.users.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long>{
	  public User findByUserName(String userName);
}
