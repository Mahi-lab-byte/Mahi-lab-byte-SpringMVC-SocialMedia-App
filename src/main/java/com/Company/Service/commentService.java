package com.Company.Service;

import java.util.List;

import com.Company.Model.Comment;

public interface commentService {

	public List<Comment> getcomments(int id);

	public void savecomment(Comment comment);

}
