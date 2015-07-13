package com.itechart.ticketservice.service.postgre;

import com.itechart.ticketservice.model.postgre.User;

public interface UserService {
	User getUserByLogin(String login);
}
