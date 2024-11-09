package com.maven;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Account {
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	@Id
	private int accid;
	private int accbal;
	private String acctype;

}
