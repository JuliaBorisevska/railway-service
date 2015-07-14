package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user_details")
public class User extends com.itechart.ticketservice.model.postgre.Entity{
	
	@Column(name = "login", nullable = false, insertable = true, updatable = true)
	private String login;
	
	@Column(name = "password", nullable = false, insertable = true, updatable = true)
	private String password;
	
	@OneToOne
	@JoinColumn(name = "personal_data_id", referencedColumnName = "id", nullable = false)
	private Person person;
    
	@ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    private Role role;
 

	public String getLogin() {
        return login;
    }
 
    public void setLogin(String login) {
        this.login = login;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
    
	
    
}
