package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.entity.User;
import com.pz.project.TicketSelling.security.services.UserDetailsServiceImpl;
import com.pz.project.TicketSelling.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    private final
    UserService userService;


    private final
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    public UserController(UserDetailsServiceImpl userDetailsService, UserService userService) {
        this.userDetailsService = userDetailsService;
        this.userService = userService;
    }

    @GetMapping("/users/{username}")
    public Optional<User> find(@PathVariable String username){
        return userService.find(username);
    }


    @RequestMapping(value="/users", params="login")
    private User getUserByLogin(@RequestParam("login") String login){
        return userDetailsService.findUserByUsername(login);
    }

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userDetailsService.getAllUsers();
    }

    @PostMapping(value = "/users")
    public void updateUser(@RequestBody User user){
        userDetailsService.updateUser(user);
    }
}
