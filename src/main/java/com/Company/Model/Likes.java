package com.Company.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Likes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean liked;
	private String username;
	private int postid;
	
	public Likes() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public Likes(boolean liked, String username, int postid) {
		super();
		this.liked = liked;
		this.username = username;
		this.postid = postid;
	}

	@Override
	public String toString() {
		return "Likes [id=" + id + ", liked=" + liked + ", username=" + username + ", postid=" + postid + "]";
	}
	
	
}
