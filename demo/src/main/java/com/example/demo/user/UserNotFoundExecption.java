package com.example.demo.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExecption extends RuntimeException {
    

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserNotFoundExecption(String message) {
        super(message);
    }
}