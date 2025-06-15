package com.Company.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Company.Model.users;
import com.Company.Service.signupService;

@Controller
public class SignupController {
	
	@Autowired
	private signupService signupservice;
	
	@GetMapping("/signup")
	public String signuppage(Model model) {
		users user=new users();
		model.addAttribute("signup", user);
		return "signup";
	}
	
	@PostMapping("/signupuser")
	public String signupuser(@ModelAttribute("signup") users user) {
		signupservice.signupuser(user);
		return "redirect:/showMyLoginPage";
	}
	
}
