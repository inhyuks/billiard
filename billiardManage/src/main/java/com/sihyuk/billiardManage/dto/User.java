package com.sihyuk.billiardManage.dto;

public class User {
	private Long no;
	private String id;
	private String pw;
	private String name;
	private String nickname;
	private String nTel;
	private int avg;
	private int permit;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getnTel() {
		return nTel;
	}
	public void setnTel(String nTel) {
		this.nTel = nTel;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getPermit() {
		return permit;
	}
	public void setPermit(int permit) {
		this.permit = permit;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", id=" + id + ", pw=" + pw + ", name=" + name + ", nickname=" + nickname + ", nTel="
				+ nTel + ", avg=" + avg + ", permit=" + permit + "]";
	}

}
