package com.Company.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Company.DAO.postDAO;
import com.Company.Model.Posts;

@Service
public class postserviceImpl implements postService {

	@Autowired
	public postDAO postdao;

	@Override
	@Transactional
	public void savepost(Posts posts) {
		postdao.savepost(posts);
		
	}

	@Override
	@Transactional
	public List<Posts> getallposts() {
		return postdao.getallposts();
	}

	@Override
	@Transactional
	public Posts getpost(int id) {
		return postdao.getpost(id);
	}
}
