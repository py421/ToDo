package com.kholapooja33.lld.ToDo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Component
public class UserDAOService {
    private Map<String,User> users = new HashMap<>();
    private Set<String> mails = new HashSet<>();
    public boolean save(User user) {
        if(mails.contains(user.getEmail()))
            return false;
        users.add(user);
        return true;
    }
    public User findById(String id){
        for(User user : users)
            if(user.getValue().getUserName()==id)
                return user.getValue();
        }
        return null;
    }

}
