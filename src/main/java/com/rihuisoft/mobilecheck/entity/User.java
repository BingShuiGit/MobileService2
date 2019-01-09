package com.rihuisoft.mobilecheck.entity;

import com.rihuisoft.mobilecheck.model.ListBean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * 用户
 * @author liang
 *
 */
@XmlRootElement(name = "User")
public class User {
	private static final long serialVersionUID = -5461373449802431627L;
	private int id;
	private String userId;
	private String userName;
	private String IDImage;
	private String userImage;
	private BigDecimal salary;
	//	private Date birthday;
	private String isVip;
//	private ListBean hobbies;
	public User(){
		super();
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIDImage() {
		return IDImage;
	}

	public void setIDImage(String IDImage) {
		this.IDImage = IDImage;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	@XmlElement
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@XmlElement
	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

//	@XmlElement
//	public Date getBirthday() {
//		return birthday;
//	}
//
//	public void setBirthday(Date birthday) {
//		this.birthday = birthday;
//	}
@XmlElement

public String getIsVip() {
		return isVip;
	}

	public void setIsVip(String isVip) {
		this.isVip = isVip;
	}


	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	@XmlElement
//	public ListBean getHobbies() {
//		return hobbies;
//	}

//	public void setHobbies(ListBean hobbies) {
//		this.hobbies = hobbies;
//	}


	public User(int id,String userId, String userName , String IDImage,String userImage,BigDecimal salary,String isVip) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.IDImage = IDImage;
		this.userImage = userImage;
		this.salary = salary;
		this.isVip = isVip;
	}
}
