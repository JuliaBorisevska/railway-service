package com.itechart.ticketservice.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan({"com.itechart.ticketservice.service", "com.itechart.ticketservice.repository", "com.itechart.ticketservice.model"})
public class RootContextConfig {

}
