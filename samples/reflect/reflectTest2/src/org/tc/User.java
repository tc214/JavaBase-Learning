package org.tc;

import java.util.Date;

@Deprecated
public class User {
	
	private int id;
	private String name;
	private Date birthday;
	private float money;
	public float publicField;
	
	public User() {}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(float money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "id=" + this.id + " name=" + this.name + " birthday=" + this.birthday + " money=" + this.money; 
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}
	
	public void testMethod() {
		
	}

}
