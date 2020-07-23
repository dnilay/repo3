package com.example.photoappapiuser.ui;

public class UserNotFoundException extends Throwable {
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String s) {
        super(s);
    }

    public UserNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UserNotFoundException(Throwable throwable) {
        super(throwable);
    }

    protected UserNotFoundException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
