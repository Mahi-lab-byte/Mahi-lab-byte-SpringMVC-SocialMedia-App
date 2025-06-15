package com.Company.DAO;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Company.Model.users;

@Repository
public class userDAOImpl implements userDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<users> getusers() {
		Session session=sessionFactory.getCurrentSession();
		Query<users> query=session.createQuery("from users",users.class);
		List<users> user=query.getResultList();
		return user;
	}
	

}
