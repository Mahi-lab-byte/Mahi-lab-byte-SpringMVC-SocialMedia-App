package com.Company.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Company.DAO.SignupDAO;
import com.Company.Model.users;

@Service
public class signupServiceImpl implements signupService {
	
	@Autowired
	private SignupDAO signupdao;

	@Override
	@Transactional
	public void signupuser(users user) {
		signupdao.signupuser(user);
		
	}
}
