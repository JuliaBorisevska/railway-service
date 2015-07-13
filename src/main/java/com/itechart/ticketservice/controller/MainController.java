package com.itechart.ticketservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itechart.ticketservice.service.orient.StopService;



@Controller
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
    private StopService stopService;
	
	@RequestMapping(value = "/")
	public String index() {
		LOGGER.info("index");
		stopService.getAll();
		return "index";
	}
	
}
