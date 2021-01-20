package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends IllegalArgumentException {
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
