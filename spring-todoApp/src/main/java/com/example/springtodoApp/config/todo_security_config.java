package com.example.springtodoApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class todo_security_config extends WebSecurityConfigurerAdapter{


@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.antMatcher("/**").authorizeRequests().anyRequest().authenticated();
	
	 http.csrf().disable().authorizeRequests().antMatchers("/res")
      .permitAll()
      .anyRequest()
      .authenticated().and()
       .formLogin()
       .loginPage("/login").defaultSuccessUrl("/home")
       .permitAll()
       .and()
       .logout()
       .permitAll();
		
		
	}
@SuppressWarnings("deprecation")
@Bean
public static NoOpPasswordEncoder passwordEncoder() {
return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
}

}
