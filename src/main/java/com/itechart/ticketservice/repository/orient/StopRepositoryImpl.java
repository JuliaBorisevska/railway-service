package com.itechart.ticketservice.repository.orient;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itechart.ticketservice.model.orient.Stop;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;
import com.tinkerpop.gremlin.java.GremlinPipeline;
import com.tinkerpop.pipes.PipeFunction;
import com.tinkerpop.pipes.branch.LoopPipe;
import com.tinkerpop.pipes.branch.LoopPipe.LoopBundle;
import com.tinkerpop.pipes.transform.PathPipe;

@Repository
public class StopRepositoryImpl implements StopRepository{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StopRepositoryImpl.class);

	@Autowired
	private OrientGraphFactory orientGraphFactory;
	
	//https://groups.google.com/forum/#!msg/aureliusgraphs/d3jvgJeArOU/lMoObkk-If0J
	
	@Override
	public void getAll(){
		LOGGER.info("Start getAll method");
		OrientGraph graph = orientGraphFactory.getTx();
	    try {
	    	for (Vertex v : graph.getVertices()) {
	    		LOGGER.debug("Stop title - {}",v.getProperty("title"));
	    	}
	    	final Vertex v1 = graph.getVertex("#12:1");
	    	final Vertex v2 = graph.getVertex("#12:10");
	    	Stop firstStop = new Stop(v1);
	    	Stop lastStop = new Stop(v2);
	    	LOGGER.debug("First stop  - {}", firstStop);
	    	LOGGER.debug("Last stop - {}", lastStop);
	    	LOGGER.debug("Stop v1 title - {}",v1.getProperty("title"));
	    	LOGGER.debug("Stop v2 title - {}",v2.getProperty("title"));
	    	GremlinPipeline<Vertex,List> pipe = new GremlinPipeline<Vertex,List>().start(v1).as("x").out().
                    loop("x", new PipeFunction<LoopPipe.LoopBundle<Vertex>, Boolean>(){
                    	@Override    
                    	public Boolean compute(LoopBundle<Vertex> bundle)
                            {
                                    return !bundle.getObject().getId().equals(v2.getId());
                             }
                      }).path();
	    	for (final List path : pipe) {
	    		//PathPipe pathPipe = (PathPipe)path;
	    		LOGGER.debug("Path: {}",path);
	    	}
	    } catch (Exception e) {                                               ///change!!
	        e.printStackTrace();
	    } finally {
	        graph.shutdown();
	    }
	}
	
	
}
