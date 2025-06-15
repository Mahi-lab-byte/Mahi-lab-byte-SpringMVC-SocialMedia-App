package com.Company.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Company.DAO.commentDAO;
import com.Company.Model.Comment;

@Service
public class commentServiceImpl implements commentService {
	
	@Autowired
	private commentDAO commentdao;

	@Override
	@Transactional
	public List<Comment> getcomments(int id) {
		return commentdao.getcomments(id);
	}

	@Override
	@Transactional
	public void savecomment(Comment comment) {
		commentdao.savecomment(comment);
		
	}
	
}
