package com.kholapooja33.lld.ToDo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController

public class UserDAOService {
    private Map<String,User> users = new HashMap<>();
    private Set<String> mails = new HashSet<>();
    public boolean save(User user) {
        if(mails.contains(user.getEmail()))
            return false;
        users.add(user);
        return true;
    }
}
