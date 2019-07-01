package com.sihyuk.billiardManage.dao;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
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
	
	public List<Billiard> selectAll(Integer start, Integer limit){
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(SELECT_BILLIARD_LIST, params,rowMapper);
	}//당구 매장 리스트 가져오기

	public int selectBilliardCount() {
		return jdbc.queryForObject(SELECT_BILLIARD_COUNT, Collections.emptyMap(), Integer.class);
	} // 당구 총매장수
	
	public List<Billiard> selectBilliardByName(Integer start, Integer limit, String bname){
		bname = "%"+bname+"%";
		Map<String, Object> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		params.put("bName", bname);
		return jdbc.query(SELECT_BILLIARD_LIST_BY_NAME, params,rowMapper);
	}//이름에 따른 당구 매장 리스트 가져오기

	public int selectBilliardCountByName(String bname) {
		try {
			bname = "%"+bname+"%";
			Map<String, ?> params = Collections.singletonMap("bName", bname);
			return jdbc.queryForObject(SELECT_BILLIARD_COUNT_BY_NAME, params, Integer.class);
		}
		catch (EmptyResultDataAccessException e) {
			// select 시 조건에 맞는 결과가없으면
			return 0;
		}
	} //이름에 따른 당구장 총매장수
}
