package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "personal_data")
public class Person extends com.itechart.ticketservice.model.postgre.Entity{
	
	@Column(name = "first_name", nullable = false, insertable = true, updatable = true)
	private String firstName;
	@Column(name = "last_name", nullable = false, insertable = true, updatable = true)
	private String lastName;
	@Column(name = "middle_name", nullable = true, insertable = true, updatable = true)
	private String middleName;
	@Column(name = "passport", nullable = true, insertable = true, updatable = true)
	private String passport;
	
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
}
