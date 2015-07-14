package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.joda.time.LocalTime;


@Entity
@Table(name = "ticket")
public class Ticket extends com.itechart.ticketservice.model.postgre.Entity{
	
	@ManyToOne
    @JoinColumn(name = "seat_id", referencedColumnName = "id", nullable = false)
    private Seat seat;
	
	@Column(name = "first_stop_id", nullable = false, insertable = true, updatable = true)
	private Long firstStopId;
	
	@Column(name = "last_stop_id", nullable = false, insertable = true, updatable = true)
	private Long lastStopId;

	@Column(name = "cost", nullable = false, insertable = true, updatable = true)
	private Long cost;
	
	@Column(name = "dispatch_time", nullable = false, insertable = true, updatable = true)
	private LocalTime dispatchTime;
	
	@Column(name = "arrival_time", nullable = false, insertable = true, updatable = true)
	private LocalTime arrivalTime;
	
	@ManyToOne
    @JoinColumn(name = "personal_data_id", referencedColumnName = "id", nullable = false)
    private Person person;

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

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

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public LocalTime getDispatchTime() {
		return dispatchTime;
	}

	public void setDispatchTime(LocalTime dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
