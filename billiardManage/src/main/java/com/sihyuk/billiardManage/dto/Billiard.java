package com.sihyuk.billiardManage.dto;

public class Billiard {
	private int num;
	private String bName;
	private String mapaddress_01;
	private String mapaddress_02;
	private String address_01;
	private String address_02;
	private String address_03;
	private int bigCharge;
	private String bTel;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getBigCharge() {
		return bigCharge;
	}
	public void setBigCharge(int bigCharge) {
		this.bigCharge = bigCharge;
	}
	public String getbTel() {
		return bTel;
	}
	public void setbTel(String bTel) {
		this.bTel = bTel;
	}
	public String getMapaddress_01() {
		return mapaddress_01;
	}
	public void setMapaddress_01(String mapaddress_01) {
		this.mapaddress_01 = mapaddress_01;
	}
	public String getMapaddress_02() {
		return mapaddress_02;
	}
	public void setMapaddress_02(String mapaddress_02) {
		this.mapaddress_02 = mapaddress_02;
	}
	public String getAddress_01() {
		return address_01;
	}
	public void setAddress_01(String address_01) {
		this.address_01 = address_01;
	}
	public String getAddress_02() {
		return address_02;
	}
	public void setAddress_02(String address_02) {
		this.address_02 = address_02;
	}
	public String getAddress_03() {
		return address_03;
	}
	public void setAddress_03(String address_03) {
		this.address_03 = address_03;
	}
	@Override
	public String toString() {
		return "Billiard [num=" + num + ", bName=" + bName + ", mapaddress_01=" + mapaddress_01 + ", mapaddress_02="
				+ mapaddress_02 + ", address_01=" + address_01 + ", address_02=" + address_02 + ", address_03="
				+ address_03 + ", bigCharge=" + bigCharge + ", bTel=" + bTel + "]";
	}
	
}
