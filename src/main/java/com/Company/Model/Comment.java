package com.Company.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String comment;
	private int postid;
	
	public Comment() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public Comment(String username, String comment, int postid) {
		super();
		this.username = username;
		this.comment = comment;
		this.postid = postid;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", username=" + username + ", comment=" + comment + ", postid=" + postid + "]";
	}

	public Comment(int id, String username, String comment, int postid) {
		super();
		this.id = id;
		this.username = username;
		this.comment = comment;
		this.postid = postid;
	}

	
	
}
