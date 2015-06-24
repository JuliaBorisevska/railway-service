package com.itechart.ticketservice.service;

import com.itechart.ticketservice.model.postgre.User;

public interface UserService {
	User getUserByLogin(String login);
}
