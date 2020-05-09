package com.agilisum.example.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
	
	auth.inMemoryAuthentication()
    .withUser("user").password("{noop}password").roles("USER")
    .and()
    .withUser("admin").password("{noop}password").roles("ADMIN");;
	 }
	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
			http
	        .httpBasic()
	        .and()
	        .authorizeRequests()
	        .antMatchers(HttpMethod.GET, "/products/api/getproductdetails").hasRole("USER")
	        .antMatchers(HttpMethod.GET, "/config/api/getconfigdetails").hasRole("ADMIN")
	        .and()
	        .csrf().disable()
	        .formLogin().disable();
			
			
	 }
	 

}
