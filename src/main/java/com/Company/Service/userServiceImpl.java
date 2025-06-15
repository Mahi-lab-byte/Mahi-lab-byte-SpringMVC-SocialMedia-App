package com.Company.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Company.DAO.userDAO;
import com.Company.Model.users;

@Service
public class userServiceImpl implements userService {
		
	@Autowired
	private userDAO userdao;

	@Override
	@Transactional
	public List<users> getusers() {
		return userdao.getusers();
	}
}
