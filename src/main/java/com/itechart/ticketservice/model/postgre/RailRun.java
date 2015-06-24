package com.itechart.ticketservice.model.postgre;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.joda.time.LocalDate;

public class RailRun extends com.itechart.ticketservice.model.postgre.Entity{

	@Column(name = "dispatch_date", nullable = false, insertable = true, updatable = true)
	private LocalDate dispatchDate;
    @ManyToOne
    @JoinColumn(name = "train_id", referencedColumnName = "id", nullable = false)
    private Train train;
	
    
    public LocalDate getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	
    
}
