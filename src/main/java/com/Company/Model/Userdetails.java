package com.Company.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private long mobile;
	private String address1;
	private String address2;
	private String town;
	private int postCode;
	private boolean verified;
	public Userdetails() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public Userdetails(String fullName, long mobile, String address1, String address2, String town, int postCode,
			boolean verified) {
		super();
		this.fullName = fullName;
		this.mobile = mobile;
		this.address1 = address1;
		this.address2 = address2;
		this.town = town;
		this.postCode = postCode;
		this.verified = verified;
	}
	@Override
	public String toString() {
		return "Userdetails [id=" + id + ", fullName=" + fullName + ", mobile=" + mobile + ", address1=" + address1
				+ ", address2=" + address2 + ", town=" + town + ", postCode=" + postCode + ", verified=" + verified
				+ "]";
	}
	
	
}
