package com.itechart.ticketservice.controller;

import java.security.Principal;

import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.itechart.ticketservice.model.ErrorMessage;
import com.itechart.ticketservice.model.postgre.User;
import com.itechart.ticketservice.service.UserService;


@Controller
public class AuthorisationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthorisationController.class);
	private final String ERROR_MESSAGE = "Неправильные имя/пароль";

	@Autowired
    private UserService userService;
	
	@ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User login(Principal principal) {
    	User user = userService.getUserByLogin(principal.getName());
    	user.setPassword(null);
		LOGGER.info("Start method login with user parameters: login - {}, firstName - {}, lastName - {}, roleTitle - {}",
				user.getLogin(), user.getPerson().getFirstName(), user.getPerson().getLastName(), user.getRole().getTitle());
        return user;
    }
 
	@ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
    public ErrorMessage loginerror(Principal principal) {
		LOGGER.info("Start loginerror() method");
		ErrorMessage error = new ErrorMessage();
		error.setDescription(ERROR_MESSAGE);
        return error;
    }
 
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "index";
    }
	
}
