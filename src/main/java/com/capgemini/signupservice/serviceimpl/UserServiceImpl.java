package com.capgemini.signupservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.signupservice.dao.UserDao;
import com.capgemini.signupservice.entity.User;

@Service
public class UserServiceImpl {

	@Autowired
	private UserDao userDao;

	public User createProfile(User user) {
		return userDao.save(user);
	}

	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	public List<User> findByName(String name) {
		return userDao.findByName(name);
	}

	public User addRequest(String myEmail, String friendEmail) {

		User user = findByEmail(friendEmail);

		List<String> demo = new ArrayList<String>();
		demo.add(myEmail);

		user.setRequests(demo);
		userDao.save(user);

		return user;
	}

	public Optional<User> findById(String mail) {
		Optional<User> user = userDao.findById(mail);
		return user;
	}

	public User confirmRequest(String myEmail1, String friendEmail1) {
	
		User user = findByEmail(myEmail1);
		
		List<String> newFriend= new ArrayList<>();
		
		newFriend.add(friendEmail1);
		user.setFriend(newFriend);
		userDao.save(user);
		
		System.out.println("friend add done");
		
		List<String> newFriend1= new ArrayList<>();
		newFriend1.remove(friendEmail1);
		user.setRequests(newFriend1);
		userDao.save(user);
		System.out.println("request removed");
		
		User user1 = findByEmail(friendEmail1);

		List<String> newFriend2= new ArrayList<>();
		newFriend2.add(myEmail1);
		user1.setFriend(newFriend2);
		userDao.save(user1);
		System.out.println("friend added .....");
		return null;
	}

}
