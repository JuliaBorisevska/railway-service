package com.itechart.ticketservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user_details")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, insertable = true, updatable = true)
	private Long id;
	@Column(name = "login", nullable = false, insertable = true, updatable = true)
	private String login;
	@Column(name = "password", nullable = false, insertable = true, updatable = true)
	private String password;
	@Column(name = "first_name", nullable = false, insertable = true, updatable = true)
	private String firstName;
	@Column(name = "last_name", nullable = false, insertable = true, updatable = true)
	private String lastName;
	@Column(name = "middle_name", nullable = true, insertable = true, updatable = true)
	private String middleName;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    private Role role;
 
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
    
    
}
