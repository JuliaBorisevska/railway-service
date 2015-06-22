package com.itechart.ticketservice.service;

import com.itechart.ticketservice.model.User;

public interface UserService {
	User getUserByLogin(String login);
}
