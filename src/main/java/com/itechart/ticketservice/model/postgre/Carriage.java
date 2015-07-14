package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "carriage")
public class Carriage extends com.itechart.ticketservice.model.postgre.Entity {
	
	@ManyToOne
    @JoinColumn(name = "carriage_type_id", referencedColumnName = "id", nullable = false)
    private CarriageType carriageType;
	
	@ManyToOne
    @JoinColumn(name = "rail_run_id", referencedColumnName = "id", nullable = false)
    private RailRun railRun;
	
	@Column(name = "unique_number", nullable = false, insertable = true, updatable = true)
	private Long uniqueNumber;

	public CarriageType getCarriageType() {
		return carriageType;
	}

	public void setCarriageType(CarriageType carriageType) {
		this.carriageType = carriageType;
	}

	public RailRun getRailRun() {
		return railRun;
	}

	public void setRailRun(RailRun railRun) {
		this.railRun = railRun;
	}

	public Long getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(Long uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}
	
	
}
