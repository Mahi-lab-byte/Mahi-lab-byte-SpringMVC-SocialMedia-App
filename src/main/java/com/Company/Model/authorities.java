package com.Company.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class authorities {
	
	@Id
	@Column(name="username")
	private String name;
	@Column(name="authority")
	private String authority;
	public authorities() {
		 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "authorities [name=" + name + ", authority=" + authority + "]";
	}
	public authorities(String name, String authority) {
		super();
		this.name = name;
		this.authority = authority;
	}
	
}
