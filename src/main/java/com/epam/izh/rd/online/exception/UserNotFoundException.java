package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String s) {
        System.err.println(s);
    }
}
