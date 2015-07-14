package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "seat_status")
public class SeatStatus extends com.itechart.ticketservice.model.postgre.Entity{

	@Column(name = "title", nullable = false, insertable = true, updatable = true)
	private String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
