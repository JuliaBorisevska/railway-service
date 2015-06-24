package com.itechart.ticketservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.itechart.ticketservice.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
    private UserDetailsServiceImpl userDetailsService;
 
    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }
   /* 
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
	*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {

    	http.csrf()
        .disable()
        .authorizeRequests()
        .antMatchers("/cashier/**").access("hasRole('ROLE_CASHIER')")
        //.antMatchers("/customer/**").access("hasRole('ROLE_CUSTOMER')")
        .and();
    	
    	http.formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/login")
        //.loginProcessingUrl("/login")
        .failureUrl("/loginfailed")
        .usernameParameter("username")
        .passwordParameter("password")
        .permitAll();

    	http.logout()
        .permitAll()
        .logoutUrl("/logout")
        .logoutSuccessUrl("/logout")
        .invalidateHttpSession(true);
  

    }
    
}
