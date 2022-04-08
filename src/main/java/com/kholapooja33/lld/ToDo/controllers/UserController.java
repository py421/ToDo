package com.kholapooja33.lld.ToDo.controllers;

import com.kholapooja33.lld.ToDo.dao.UserDAOService;
import com.kholapooja33.lld.ToDo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    //private final Set<String> names = new HashSet<>();
    @Autowired
    private UserDAOService userDaoService;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user){
        userDaoService.save(user);
    }

    @GetMapping("/profile/{username}")
    public User findUserByUserName(@PathVariable String username){
        return userDaoService.findByUserName(username);
    }

//    @GetMapping("/get")
//    public Set<String> getHelloWorld(){
//        return names;
//    }

//    @PostMapping("/post/{name}")
//    public void addName(@PathVariable String name) throws UserAlreadyExistsException {
//        if(names.contains(name))
//            throw new UserAlreadyExistsException("Username "+ name +" is already taken!!");
//        else
//            this.names.add(name);
//    }

}
