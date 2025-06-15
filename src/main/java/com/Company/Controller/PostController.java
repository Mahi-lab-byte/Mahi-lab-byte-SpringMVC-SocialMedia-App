package com.Company.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Company.Model.Posts;
import com.Company.Model.users;
import com.Company.Service.postService;
import com.Company.Service.userService;

@Controller
public class PostController {
	
	@Autowired
	private userService userservice;
	
	@Autowired
	public postService postservice;
	
	@PostMapping("/savepost")
	public String savepost(@ModelAttribute("post") Posts posts,Model model) {
		List<users> user=userservice.getusers();
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User p=(User) authentication.getPrincipal();
		Object q=authentication.getCredentials();  
		users credentials = null;
		for(int i=0;i<user.size();i++) {
			if(user.get(i).getUsername().equals(p.getUsername())) {
				credentials=user.get(i);
				 
			}
		}
		posts.setUsername(credentials.getUsername());
		
		
		Date d=new Date();
		String date=d.getDate()+"-"+d.getMonth();
		posts.setDate(date);
		
		System.out.println(posts.getHeading()+"--->"+posts.getStory());
		postservice.savepost(posts);
		return "redirect:/";
	}
}
