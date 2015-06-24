package com.itechart.ticketservice.model.orient;

import java.util.List;

public class Stop {

	private Long id;
	private String title;
	private List<Long> trainIds;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Long> getTrainIds() {
		return trainIds;
	}
	public void setTrainIds(List<Long> trainIds) {
		this.trainIds = trainIds;
	}
	
	
}
