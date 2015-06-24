package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;

import org.joda.time.LocalTime;

public class Train extends com.itechart.ticketservice.model.postgre.Entity{

	@Column(name = "first_stop_id", nullable = false, insertable = true, updatable = true)
	private Long firstStopId;
	@Column(name = "last_stop_id", nullable = false, insertable = true, updatable = true)
	private Long lastStopId;
	@Column(name = "dispatch_time", nullable = false, insertable = true, updatable = true)
	private LocalTime dispatchTime;
	@Column(name = "periodicity", nullable = false, insertable = true, updatable = true)
	private String periodicity;
	
	
	public Long getFirstStopId() {
		return firstStopId;
	}
	public void setFirstStopId(Long firstStopId) {
		this.firstStopId = firstStopId;
	}
	public Long getLastStopId() {
		return lastStopId;
	}
	public void setLastStopId(Long lastStopId) {
		this.lastStopId = lastStopId;
	}
	public LocalTime getDispatchTime() {
		return dispatchTime;
	}
	public void setDispatchTime(LocalTime dispatchTime) {
		this.dispatchTime = dispatchTime;
	}
	public String getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}
	
	
	
}
