package com.kholapooja33.lld.ToDo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String s) {
        super(s);
    }

}
