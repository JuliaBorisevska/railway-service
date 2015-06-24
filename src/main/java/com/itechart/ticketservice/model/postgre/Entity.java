package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;



@MappedSuperclass
public class Entity {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, insertable = true, updatable = true)
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
