package com.Company.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Company.Model.Comment;

@Repository
public class commentDAOImpl implements commentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Comment> getcomments(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query<Comment> q=session.createQuery("from Comment where postid=:pid",Comment.class);
		q.setParameter("pid",id);
		List<Comment> comment=q.getResultList();
		return comment;
	}

	@Override
	public void savecomment(Comment comment) {
		Session session=sessionFactory.getCurrentSession();
		session.save(comment);
		
	}
	
	
}
