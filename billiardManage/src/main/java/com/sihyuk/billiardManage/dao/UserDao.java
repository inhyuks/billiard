package com.sihyuk.billiardManage.dao;


import static com.sihyuk.billiardManage.dao.UserSql.*;
import java.util.Collections;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.sihyuk.billiardManage.dto.User;

@Repository
public class UserDao {
	private NamedParameterJdbcTemplate jdbc;
	private JdbcTemplate jdbcT;
	private SimpleJdbcInsert insertAction;
	private RowMapper<User> rowMapper = BeanPropertyRowMapper.newInstance(User.class);
    public UserDao(DataSource dataSource) {
        this.insertAction = new SimpleJdbcInsert(dataSource)
            .withTableName("member")
            .usingGeneratedKeyColumns("no");
    }
    
	public long insertUser(User user) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(user);
		return insertAction.executeAndReturnKey(params).longValue();
	}
	
	public User getUserByNo(long no) {
		Map<String, ? > params = Collections.singletonMap("no",no);
		return jdbc.queryForObject(SELECT_USER_BY_NO, params, rowMapper);
	}

	public int overlapChk(User user) {
		String id = user.getId();
		int count = jdbcT.queryForObject("select count(*) from member where id = ?", Integer.class, id);
		return count;
/*			try {
				
				System.out.println(user.getId());
				SqlParameterSource params = new BeanPropertySqlParameterSource(user);
				Integer a =jdbc.queryForObject(SELECT_USER_BY_ID, params, Integer.class);
				System.out.println("data : "+ a);
				return a;
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}*/
			
	}
}
