package com.sihyuk.billiardManage.dao;

import static com.sihyuk.billiardManage.dao.UserSql.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.sihyuk.billiardManage.dto.User;

@Repository
public class UserDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<User> rowMapper = BeanPropertyRowMapper.newInstance(User.class);

	public UserDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource).withTableName("member").usingGeneratedKeyColumns("no");
	}

	public long insertUser(User user) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(user);
		return insertAction.executeAndReturnKey(params).longValue();
	} //유저 등록

	public User getUserById(String id,String pw) {
		try {
			Map<String, ?> params = Collections.singletonMap("id", id);
			User user = jdbc.queryForObject(SELECT_USER_BY_ID, params, rowMapper);
			return user;
		} catch (EmptyResultDataAccessException e) {
			// select 시 조건에 맞는 결과가없으면
			return null;
		}
	} // id 를 통해 유저 확인

	public int overlapChk(User user) {
		String id = user.getId();
		String nickName = user.getNickname();
		Map<String, String> params = new HashMap<>();
		params.put("id", id);
		params.put("nickname", nickName);
		int count = jdbc.queryForObject(SELECT_USER_BY_ID_OR_NICKNAME, params, Integer.class);
		return count;
	} // 중복확인
}
