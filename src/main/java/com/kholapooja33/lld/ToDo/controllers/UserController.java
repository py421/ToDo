package com.kholapooja33.lld.ToDo.controllers;

import com.kholapooja33.lld.ToDo.exceptions.UserAlreadyExistsException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {
    private final Set<String> names = new HashSet<>();

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
