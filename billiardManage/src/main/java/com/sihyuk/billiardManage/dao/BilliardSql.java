package com.sihyuk.billiardManage.dao;

public class BilliardSql {

	public static final String SELECT_BILLIARD_LIST = "SELECT * FROM billiard ORDER BY num DESC limit :start, :limit";
	public static final String SELECT_BILLIARD_COUNT = "SELECT count(*) FROM billiard";
}
