package com.sihyuk.billiardManage.dao;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sihyuk.billiardManage.dto.Billiard;
import static com.sihyuk.billiardManage.dao.BilliardSql.*;

@Repository
public class BilliardDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Billiard> rowMapper = BeanPropertyRowMapper.newInstance(Billiard.class);

	public BilliardDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Billiard> selectAll(Integer start, Integer limit){//당구 매장 리스트 가져오기
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(SELECT_BILLIARD_LIST, params,rowMapper);
	}

	public int selectBilliardCount() { // 당구 총매장수
		return jdbc.queryForObject(SELECT_BILLIARD_COUNT, Collections.emptyMap(), Integer.class);
	}
}
