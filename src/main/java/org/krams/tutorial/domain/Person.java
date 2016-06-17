package org.krams.tutorial.domain;

import java.io.Serializable;

/**
 * A simple POJO representing a Person
 * 
 * @author Krams at {@link http://krams915@blogspot.com}
 */
public class Person implements Serializable {

	private static final long serialVersionUID = -5527566248002296042L;
	
	private String pid;
	private String firstName;
	private String lastName;
	private Double money;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}
