package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "stop_details")
public class StopDetails extends com.itechart.ticketservice.model.postgre.Entity{
	
	@ManyToOne
    @JoinColumn(name = "train_id", referencedColumnName = "id", nullable = false)
    private Train train;
	
	@Column(name = "stop_from_id", nullable = false, insertable = true, updatable = true)
	private Long stopFromId;
	
	@Column(name = "stop_to_id", nullable = false, insertable = true, updatable = true)
	private Long stopToId;
	
	@Column(name = "cost", nullable = false, insertable = true, updatable = true)
	private Long cost;
	
	@ManyToOne
    @JoinColumn(name = "carriage_type_id", referencedColumnName = "id", nullable = false)
    private CarriageType carriageType;

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Long getStopFromId() {
		return stopFromId;
	}

	public void setStopFromId(Long stopFromId) {
		this.stopFromId = stopFromId;
	}

	public Long getStopToId() {
		return stopToId;
	}

	public void setStopToId(Long stopToId) {
		this.stopToId = stopToId;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public CarriageType getCarriageType() {
		return carriageType;
	}

	public void setCarriageType(CarriageType carriageType) {
		this.carriageType = carriageType;
	}

	
	
}
