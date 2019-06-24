package com.sihyuk.billiardManage.dao;

public class UserSql {
	public static final String SELECT_USER_BY_NO = "SELECT * FROM member WHERE no = :no";
	public static final String SELECT_USER_BY_ID_OR_NICKNAME = "SELECT count(*) FROM member WHERE id = :id or nickname = :nickname";
}
