package com.akku.Flight.myService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akku.Flight.entities.User;
import com.akku.Flight.myDAL.UserDAL;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAL userDal;
	
	@Override
	public List<User> showAllUsers() {
		List<User> s = userDal.findAll();
		return s;
	}

	@Override
	public User findUserById(long id) {
		User s = userDal.findById(id).get();
		return s;
	}

	@Override
	public void deleteUserById(long id) {
		userDal.deleteById(id);
	}

	@Override
	public User saveUser(User user) {
		User u = userDal.save(user);
		return u;
	}

	@Override
	public User updateUser(User user) {
		User s = userDal.save(user);
		return s;
	}

	@Override
	public User findByEmail(String email) {
		User user = userDal.findByEmailId(email);
		return user;
	}

}
