package ru.maxima.apring_security.springsecurityapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import ru.maxima.apring_security.springsecurityapp.security.AuthenticationProviderImp;

import java.net.Authenticator;


@EnableWebSecurity
public class SecurityConfig  {
    private final AuthenticationProviderImp authenticationProviderImp;


    @Autowired
    public SecurityConfig(AuthenticationProviderImp authenticationProviderImp) {
        this.authenticationProviderImp = authenticationProviderImp;
    }

    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProviderImp);
    }
}