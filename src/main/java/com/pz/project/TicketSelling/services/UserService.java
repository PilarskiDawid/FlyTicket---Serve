package com.pz.project.TicketSelling.services;

import com.pz.project.TicketSelling.dao.UserRepository;
import com.pz.project.TicketSelling.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    final
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> find(String username){
        return userRepository.findByUsername(username);
    }
}
