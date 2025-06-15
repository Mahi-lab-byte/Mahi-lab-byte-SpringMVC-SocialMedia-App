package com.Company.DAO;

import java.util.List;

import com.Company.Model.Comment;

public interface commentDAO {

	public List<Comment> getcomments(int id);

	public void savecomment(Comment comment);

}
