package ru.maxima.apring_security.springsecurityapp.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
    UserDetails loadUserByUserName(String name) throws UsernameNotFoundException;
}
