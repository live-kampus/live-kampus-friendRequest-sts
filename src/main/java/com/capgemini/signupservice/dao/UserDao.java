package com.capgemini.signupservice.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.signupservice.entity.User;

@Repository
public interface UserDao extends MongoRepository<User, String> {

	User findByEmail(String email);
	List<User> findByName(String name);
	

}
