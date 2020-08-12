package com.example.service;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements UserDetailsService {


    private HashMap<String, User> userRepository = new HashMap();

    {
        userRepository.put("user1", new User("user1", "1"));
        userRepository.put("user2", new User("user2", "1"));
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.get(username);

        if (user == null) {//add any user
            //throw new UsernameNotFoundException("User not found");
            user = new User(username, "1");
            userRepository.put(username, user);
        }

        return user;
    }

    public boolean saveUser(User user) {
        User userFromDB = userRepository.get(user.getUsername());

        if (userFromDB != null) {
            return false;
        }

        userRepository.put(user.getUsername(), user);
        return true;
    }


    public HashMap<String, User> getUserRepository() {
        return userRepository;
    }

}
