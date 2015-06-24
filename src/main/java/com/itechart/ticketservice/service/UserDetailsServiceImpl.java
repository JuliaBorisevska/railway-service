package com.itechart.ticketservice.service;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.itechart.ticketservice.model.postgre.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
 
    @Autowired
    private UserService userService;
 
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	LOGGER.info("start method loadUserByUsername with username - {}", email);
        User user = userService.getUserByLogin(email);
        if (user==null){
        	throw new UsernameNotFoundException("User with login "+email+" wasn't found");
        }
        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority(user.getRole().getTitle()));
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), roles);
        return userDetails;
    }
 
}
