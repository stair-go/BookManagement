package com.domain;

import java.util.Date;

/**
 * 代表管理员的 Javabean
 * @author Administrator
 *
 */
public class Customer {
	private Long id;       //ID
	private String username;   //登录名
	private String password;   //密码
	private Long age;       //年龄
	private Long 	phone;     //联系电话
	private String sdean;   //公司
	private String address; //地址
	private String email;  //邮箱
	private String zy;     //重要程度
	private String bz;     //备注
	private String gj1;		//消息跟进
	private String gj2;		//电话跟进
	private String gj3;		//邮箱跟进
	private Admin admin;
	private Date dateTime = new Date();
	
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getSdean() {
		return sdean;
	}
	public void setSdean(String sdean) {
		this.sdean = sdean;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getGj1() {
		return gj1;
	}
	public void setGj1(String gj1) {
		this.gj1 = gj1;
	}
	public String getGj2() {
		return gj2;
	}
	public void setGj2(String gj2) {
		this.gj2 = gj2;
	}
	public String getGj3() {
		return gj3;
	}
	public void setGj3(String gj3) {
		this.gj3 = gj3;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}
