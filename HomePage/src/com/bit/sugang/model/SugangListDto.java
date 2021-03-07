package com.bit.sugang.model;

import java.sql.Date;

public class SugangListDto {
	private int num;
	private Date nalja,date;
	private String name,pnum,email,check;
	public SugangListDto() {}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	
	
}
