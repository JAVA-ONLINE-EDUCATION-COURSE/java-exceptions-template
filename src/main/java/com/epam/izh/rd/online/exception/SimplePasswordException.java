package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {

    public SimplePasswordException() {
        super();
    }

    public SimplePasswordException(String message) {
        super(message);
    }

    public SimplePasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimplePasswordException(Throwable cause) {
        super(cause);
    }
}
