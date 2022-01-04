package com.indra.formacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {

	@Autowired
	private JdbcTemplate jdbcT;
	
	public List<String> getAllUserNames(){
		
		List<String> user = new ArrayList<>();
		user.addAll(jdbcT.queryForList("select name from user;",String.class));
	
		return user;
	}
}
