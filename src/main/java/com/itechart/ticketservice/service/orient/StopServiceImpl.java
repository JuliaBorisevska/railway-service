package com.itechart.ticketservice.service.orient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itechart.ticketservice.repository.orient.StopRepository;

@Service
public class StopServiceImpl implements StopService{

	@Autowired
	private StopRepository stopRepository;
	
	@Override
	public void getAll() {
		stopRepository.getAll();
		
	}

}
