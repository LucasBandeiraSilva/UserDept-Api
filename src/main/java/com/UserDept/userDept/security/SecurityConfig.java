package com.UserDept.userDept.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        HttpSecurity httpSecurity = http
                .csrf(csrf -> csrf.disable()) // Desativa o CSRF  //turn of CSRF
                .headers(headers -> headers.frameOptions().sameOrigin())
                .formLogin(login -> login.disable());// Desativa o formulário de login //Turn of login form

        return http.build();
    }
}
