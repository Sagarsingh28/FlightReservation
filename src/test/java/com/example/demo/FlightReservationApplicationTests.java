package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.akku.Flight.entities.User;
import com.akku.Flight.myDAL.UserDAL;

@SpringBootTest
class FlightReservationApplicationTests {

	@Autowired
	private UserDAL userDal;
	
	@Test
	public void studentTest() {
		User stu = new User();
		stu.setFirstName("sagar");
		stu.setLastName("Singh");
		stu.setEmailId("sagar@gmail.com");
		userDal.save(stu);
	}
}
