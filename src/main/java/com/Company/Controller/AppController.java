package com.Company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Company.Model.Posts;
import com.Company.Model.users;
import com.Company.Service.postService;
import com.Company.Service.userService;

@Controller
public class AppController {
	
	@Autowired
	private userService userservice;
	
	@Autowired
	private postService postservice;	
	
	@GetMapping("/")
	public String dashboard(Model model) {
		List<users> user=userservice.getusers();
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User p=(User) authentication.getPrincipal();
		Object q=authentication.getCredentials();  
		//System.out.println(p.getUsername());
		
		users credentials = null;
		for(int i=0;i<user.size();i++) {
			if(user.get(i).getUsername().equals(p.getUsername())) {
				credentials=user.get(i);
				 
			}
		}
		model.addAttribute("credentails", credentials);
		List<Posts> allposts=postservice.getallposts();	
		System.out.println(allposts);
		model.addAttribute("allposts", allposts);
		//null posts
		Posts post=new Posts();
		model.addAttribute("post", post);
		
		
		
		
		return "dashboard";
	}
}
