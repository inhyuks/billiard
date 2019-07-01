package com.sihyuk.billiardManage.dao;

public class BilliardSql {

	public static final String SELECT_BILLIARD_LIST = "SELECT * FROM billiard ORDER BY num DESC limit :start, :limit";
	public static final String SELECT_BILLIARD_COUNT = "SELECT count(*) FROM billiard";
	public static final String SELECT_BILLIARD_LIST_BY_NAME = "SELECT * FROM billiard where b_name like :bName ORDER BY num DESC limit :start, :limit";
	public static final String SELECT_BILLIARD_COUNT_BY_NAME = "SELECT count(*) FROM billiard WHERE b_name like :bName";
}
