package com.kholapooja33.lld.ToDo.dao;

import com.kholapooja33.lld.ToDo.entities.User;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserDAOService {
    private Map<String, User> users = new HashMap<>();
    public boolean save(User user) {
        if(users.containsKey(user.getUserName()))
            return false;
        users.put(user.getUserName(),user);
        return true;
    }
    public User findByUserName(String userName){
        if(!users.containsKey(userName)){
            // throw user not found exception
            return null;
        }
        return users.get(userName);
    }

}
