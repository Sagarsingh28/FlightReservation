package com.akku.Flight.myDAL;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akku.Flight.entities.User;

public interface UserDAL extends JpaRepository<User,Long>{

	User findByEmailId(String email);
}
