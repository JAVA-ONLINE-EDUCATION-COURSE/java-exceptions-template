package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {
    public SimplePasswordException() {
    }

    public SimplePasswordException(String message) {
        super(message);
        System.out.print(message);
    }

    public SimplePasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimplePasswordException(Throwable cause) {
        super(cause);
    }


}
