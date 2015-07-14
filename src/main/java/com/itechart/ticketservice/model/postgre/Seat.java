package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "seat")
public class Seat extends com.itechart.ticketservice.model.postgre.Entity{

	@ManyToOne
    @JoinColumn(name = "carriage_id", referencedColumnName = "id", nullable = false)
    private Carriage carriage;
	
	@ManyToOne
    @JoinColumn(name = "seat_status_id", referencedColumnName = "id", nullable = false)
    private SeatStatus seatStatus;
	
	@Column(name = "sequence_number", nullable = false, insertable = true, updatable = true)
	private Long sequenceNumber;

	public Carriage getCarriage() {
		return carriage;
	}

	public void setCarriage(Carriage carriage) {
		this.carriage = carriage;
	}

	public SeatStatus getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}

	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	
}
