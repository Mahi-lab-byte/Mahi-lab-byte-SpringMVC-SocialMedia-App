package com.Company.DAO;

import java.util.List;

import com.Company.Model.Posts;

public interface postDAO {

	public void savepost(Posts posts);

	public List<Posts> getallposts();

	public Posts getpost(int id);

}
