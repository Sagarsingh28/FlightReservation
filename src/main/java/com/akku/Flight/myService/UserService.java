package com.akku.Flight.myService;

import java.util.List;

import com.akku.Flight.entities.User;

public interface UserService {

	List<User> showAllUsers();
	User findUserById(long id);
	void deleteUserById(long id);
	User updateUser(User stu);
	User saveUser(User stu);
	User findByEmail(String email);
}
