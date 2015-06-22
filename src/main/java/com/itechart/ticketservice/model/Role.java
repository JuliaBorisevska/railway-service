package com.itechart.ticketservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class Role {
	
	@Id
	@GeneratedValue
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
	private Integer id;
	@Column(name = "title", nullable = false, insertable = true, updatable = true)
	private String title;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
