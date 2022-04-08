package com.kholapooja33.lld.ToDo.controllers;

import com.kholapooja33.lld.ToDo.exceptions.UserAlreadyExistsException;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {
    private final Set<String> names = new HashSet<>();
    private UserDAOService userDaoService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        userDaoService.save(user);
    }
    @GetMapping("/get")
    public Set<String> getHelloWorld(){
        return names;
    }

    @PostMapping("/post/{name}")
    public void addName(@PathVariable String name) throws UserAlreadyExistsException {
        if(names.contains(name))
            throw new UserAlreadyExistsException("Username "+ name +" is already taken!!");
        else
            this.names.add(name);
    }

}
