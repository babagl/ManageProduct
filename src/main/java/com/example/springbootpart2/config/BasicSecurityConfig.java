package com.example.springbootpart2.config;

import com.example.springbootpart2.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserServices userServices;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService()

    }
       /* auth.inMemoryAuthentication().
                withUser("Moussa").
                password("{noop}123")
                .roles("user")
                .and()
                .withUser("ali")
                .password("{noop}123")
                .roles("admin");
    }*/



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/users/**")
                .permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

}
