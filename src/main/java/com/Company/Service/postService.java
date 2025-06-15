package com.Company.Service;

import java.util.List;

import com.Company.Model.Posts;

public interface postService {

	public void savepost(Posts posts);

	public List<Posts> getallposts();

	public Posts getpost(int id);

}
