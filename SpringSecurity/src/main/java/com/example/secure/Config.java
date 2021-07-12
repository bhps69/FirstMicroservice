package com.example.secure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class Config extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests(
				(requests)->requests.antMatchers("/account").authenticated()
				.antMatchers("/balance").authenticated()
				.antMatchers("/main").permitAll()
				.antMatchers("/update").permitAll()
				);
		http.formLogin();
		http.httpBasic();
	}

}
