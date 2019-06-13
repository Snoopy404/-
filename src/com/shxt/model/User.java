package com.shxt.model;

public class User {
	//注意:数据库里面的字段名，类里面的属性名，input标签name值要一致
	private Integer userId;
	private String userName;
	private String pwd;
	private String account;
	private Integer fk_role_id;
	private Role role;
	public Integer getFk_role_id() {
		return fk_role_id;
	}
	public void setFk_role_id(Integer fk_role_id) {
		this.fk_role_id = fk_role_id;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", pwd=" + pwd + ", account=" + account
				+ ", fk_role_id=" + fk_role_id + ", role=" + role + "]";
	}
	
	
	
}
