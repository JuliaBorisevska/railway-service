package com.itechart.ticketservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itechart.ticketservice.model.Role;
import com.itechart.ticketservice.model.User;
import com.itechart.ticketservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
 
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
    @Override
    public User getUserByLogin(String login) {
    	LOGGER.info("start method getUserByLogin with login - {}", login);
        //User user = new User();
        //user.setLogin(login);
        //user.setPassword("$2a$10$4C1eoxIIHqV/Bc.xC4lKauq887Z/QKbW6sOkXoqTvVYmUpY.x0ufu");
        //user.setFirstName("Alex");
        //user.setLastName("Volkov");
        //Role role = new Role();
        //role.setTitle("CASHIER");
        //user.setRole(role);
        //return user;
    	return userRepository.findByLogin(login);
    }
 
}
