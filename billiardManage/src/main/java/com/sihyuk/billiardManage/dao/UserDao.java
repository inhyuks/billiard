package com.sihyuk.billiardManage.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.sihyuk.billiardManage.dto.User;


@Repository
public class UserDao {
	private SimpleJdbcInsert insertAction;
	 
	public long postUser(User user) {
			SqlParameterSource params = new BeanPropertySqlParameterSource(user);
		return insertAction.executeAndReturnKey(params).longValue();
	}
}
