package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
     @Id
     @GeneratedValue
	 private Integer personId;
	 private String personName;
	 private String personAddress;
	 
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
	
	@Override
	public String toString() {
		return "Student [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ "]";
	}
	 	 
	 
}
