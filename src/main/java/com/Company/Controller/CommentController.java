package com.Company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Company.Model.Comment;
import com.Company.Model.Posts;
import com.Company.Model.users;
import com.Company.Service.commentService;
import com.Company.Service.postService;
import com.Company.Service.userService;

@Controller
public class CommentController {

	@Autowired
	private postService postservice;
	
	@Autowired
	private commentService commentservice;
	
	@Autowired
	private userService userservice;
	
	@GetMapping("/showComments")
	public String showcommentspage(@RequestParam("id") int id,Model model) {
		Posts post=postservice.getpost(id);
		model.addAttribute("post", post);
		
		List<Comment> comments=commentservice.getcomments(id);
		model.addAttribute("comments", comments);
		
		Comment newcomment=new Comment();
		model.addAttribute("newcomment", newcomment);
		return "commentpage";
	}
	
	
	
	@PostMapping("/saveComment")
	public String savecomment(@ModelAttribute("newcomment") Comment comment,@RequestParam("postid") int postid) {
		List<users> user=userservice.getusers();
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User p=(User) authentication.getPrincipal();
		users credentials = null;
		for(int i=0;i<user.size();i++) {
			if(user.get(i).getUsername().equals(p.getUsername())) {
				credentials=user.get(i);
				 
			}
		}
		System.out.println("=====>"+comment);
		comment.setUsername(credentials.getUsername());
		comment.setPostid(postid);
		System.out.println("=====>"+comment);
		commentservice.savecomment(comment);
		return "redirect:/profile";
	}
	
	
	
	
	
}
