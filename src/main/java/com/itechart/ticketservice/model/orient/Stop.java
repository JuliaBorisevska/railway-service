package com.itechart.ticketservice.model.orient;

import java.util.List;
import java.util.Set;

import com.tinkerpop.blueprints.Vertex;

public class Stop {

	private static final String ID_KEY = "id";
	private static final String TITLE_KEY = "title";
	private static final String TRAIN_IDS_KEY = "train_id";
	
	
	private String uniqueLabel;
	private Long id;
	private String title;
	private Set<Long> trainIds;
	
	public Stop() {
	}
	
	public Stop(Vertex vertex) {
		setUniqueLabel(vertex.getId().toString());
		setId((Long)vertex.getProperty(ID_KEY));
		setTitle(vertex.getProperty(TITLE_KEY).toString());
		setTrainIds((Set<Long>)vertex.getProperty(TRAIN_IDS_KEY));
	}
	
	public String getUniqueLabel() {
		return uniqueLabel;
	}

	public void setUniqueLabel(String uniqueLabel) {
		this.uniqueLabel = uniqueLabel;
	}

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
	public Set<Long> getTrainIds() {
		return trainIds;
	}
	public void setTrainIds(Set<Long> trainIds) {
		this.trainIds = trainIds;
	}

	@Override
	public String toString() {
		return "Stop [uniqueLabel=" + uniqueLabel + ", id=" + id + ", title="
				+ title + ", trainIds=" + trainIds + "]";
	}
	
	
}
