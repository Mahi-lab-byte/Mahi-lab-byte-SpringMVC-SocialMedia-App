package com.Company.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class users {
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="enabled")
	private boolean enabled;
	@Column(name="mobile")
	private Long mobile;
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	@Column(name="town")
	private String town;
	@Column(name="postcode")
	private int postcode;
	@Column(name="age")
	private int age; 
	public users() {
		
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
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

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "users [username=" + username + ", password=" + password + ", enabled=" + enabled + ", mobile=" + mobile
				+ ", address1=" + address1 + ", address2=" + address2 + ", town=" + town + ", postcode=" + postcode
				+ ", age=" + age + "]";
	}
	public users(String username, String password, boolean enabled, Long mobile, String address1, String address2,
			String town, int postcode, int age) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.mobile = mobile;
		this.address1 = address1;
		this.address2 = address2;
		this.town = town;
		this.postcode = postcode;
		this.age = age;
	}

	
}
