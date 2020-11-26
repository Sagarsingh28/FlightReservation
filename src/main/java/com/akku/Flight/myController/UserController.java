package com.akku.Flight.myController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akku.Flight.entities.User;
import com.akku.Flight.myService.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "homePage";
	}
	
	@GetMapping("/registerUser")
	public String registerUser() {
		return "login/registerUserPage";
	}
	
	@PostMapping("/registerProcess")
	public String registerProcess(@ModelAttribute("user") User user,Model model) {
		if(user.getFirstName()!="" && user.getLastName()!="" && user.getPassword()!="" && user.getEmailId()!="") {
			if(user.getPassword().equals(user.getConfirmPassword())) {
				User u = userService.saveUser(user);
				model.addAttribute("name",u.getFirstName()+" "+u.getLastName());
				return "login/registerProcessPage";
			}
		}
		model.addAttribute("msg","Form should be filled properly!!!");
		return "login/registerUserPage";
	}
	
	@GetMapping("/loginUser")
	public String login() {
		return "login/loginPage";
	}
	
	@PostMapping("/loginCheck")
	public String mainPage(@RequestParam("emailId")String email,@RequestParam("password")String pass,Model model) {
		User user = userService.findByEmail(email);
		if(user!=null) {
			if(user.getPassword().equals(pass)) {
				System.out.println("VALUE OF ID IS ---------->"+user.getId());
				model.addAttribute("user",user);
				return "mainPage";
			}
		}
		model.addAttribute("msg","Wrong Email or Password!!!");
		return "login/loginPage";		
	}
}
