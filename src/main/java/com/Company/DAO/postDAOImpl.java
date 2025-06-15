package com.Company.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Company.Model.Posts;
import com.Company.Model.users;

@Repository
public class postDAOImpl implements postDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public void savepost(Posts posts) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(posts);
		System.out.println("Post Saved Successfully!!!!");
	}


	@Override
	public List<Posts> getallposts() {
		Session session=sessionFactory.getCurrentSession();
		Query<Posts> query=session.createQuery("from Posts", Posts.class);
		List<Posts> posts=query.getResultList();
		return posts;
	}


	@Override
	public Posts getpost(int id) {
		Session session=sessionFactory.getCurrentSession();
		Posts thepost=session.get(Posts.class,id);
		return thepost;
	}

}
