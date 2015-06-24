package com.itechart.ticketservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;


@Controller
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/")
	public String index() {
		LOGGER.info("index");
		OrientGraphFactory factory = new OrientGraphFactory("remote:localhost:2424/rail-network", "root", "rootpass");
		OrientGraph graph = factory.getTx();
	    try {
	    	for (Vertex v : graph.getVertices()) {
	    		LOGGER.debug("Stop title - {}",v.getProperty("title"));
	    	}
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        graph.shutdown();
	        factory.close();
	    }
		return "index";
	}
	
}
