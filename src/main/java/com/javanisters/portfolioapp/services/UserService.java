package com.javanisters.portfolioapp.services;

import com.javanisters.portfolioapp.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UserService {
    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;

    void signUpUser(User user);

}
