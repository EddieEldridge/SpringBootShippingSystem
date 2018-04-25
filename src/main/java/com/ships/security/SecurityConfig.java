package com.ships.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebMvcConfigurerAdapter
{
	  public void configure(HttpSecurity httpSecurity) throws Exception
	  {
	    httpSecurity.authorizeRequests()
	     .antMatchers("/addShip", "/addShippingCompany", "/createOrder")
	     .hasRole("USER")
	     .and()
	     .formLogin();
	  }
	  
	  @Autowired
	  public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception
	  {
		  authentication.inMemoryAuthentication().withUser("user").password("user").roles("USER");
	  }
}
