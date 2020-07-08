package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Throwable{
    public UserNotFoundException() {
        System.out.println("Пользователь с таким логином не найден");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }
}
