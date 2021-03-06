package com.itechart.ticketservice.repository.postgre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.itechart.ticketservice.model.postgre.User;


public interface UserRepository extends JpaRepository<User, Long>{

	@Query("select u from User u where login = :login")
    User findByLogin(@Param("login") String login);
	
}
