package com.itechart.ticketservice.config;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;




@Configuration
@PropertySource("classpath:db.properties")
public class OrientConfiguration {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrientConfiguration.class);
    private static final String PROP_DATABASE_PASSWORD = "db.orient.password";
    private static final String PROP_DATABASE_URL = "db.orient.url";
    private static final String PROP_DATABASE_USERNAME = "db.orient.username";
	
    @Resource
    private Environment env;
    
    @Bean
    public OrientGraphFactory orientGraphFactory(){
        OrientGraphFactory factory = new OrientGraphFactory(env.getRequiredProperty(PROP_DATABASE_URL), 
        		env.getRequiredProperty(PROP_DATABASE_USERNAME), env.getRequiredProperty(PROP_DATABASE_PASSWORD)).setupPool(1, 10);
        LOGGER.info("OrientGraphFactory have been created.");
        return factory;
    }
    
}
