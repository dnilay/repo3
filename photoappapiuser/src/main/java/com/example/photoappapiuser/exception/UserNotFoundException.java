package com.example.photoappapiuser.exception;

import lombok.Getter;

@Getter
public class UserNotFoundException extends Throwable {
    private String message;
    public UserNotFoundException() {
    }
    public UserNotFoundException(String s) {
        this.message=s;
    }

}
