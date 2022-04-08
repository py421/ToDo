package com.kholapooja33.lld.ToDo.exceptionMappers;

import com.kholapooja33.lld.ToDo.exceptions.UserAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {
        @ExceptionHandler(UserAlreadyExistsException.class)
        public ResponseEntity handle(UserAlreadyExistsException e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(String.format("{\"error\":\"%s\"}", e.getMessage()));
        }
}
