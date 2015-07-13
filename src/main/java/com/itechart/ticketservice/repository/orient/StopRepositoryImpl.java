package com.itechart.ticketservice.repository.orient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;

@Repository
public class StopRepositoryImpl implements StopRepository{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StopRepositoryImpl.class);

	@Autowired
	private OrientGraphFactory orientGraphFactory;
	
	@Override
	public void getAll(){
		LOGGER.info("Start getAll method");
		OrientGraph graph = orientGraphFactory.getTx();
	    try {
	    	for (Vertex v : graph.getVertices()) {
	    		LOGGER.debug("Stop title - {}",v.getProperty("title"));
	    	}
	    } catch (Exception e) {                                               ///change!!
	        e.printStackTrace();
	    } finally {
	        graph.shutdown();
	        orientGraphFactory.close();
	    }
	}
	
	
}
