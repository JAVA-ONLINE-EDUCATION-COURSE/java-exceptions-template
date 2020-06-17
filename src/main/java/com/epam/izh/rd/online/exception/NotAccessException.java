package com.epam.izh.rd.online.exception;

public class NotAccessException extends RuntimeException {

    public NotAccessException(String message) {
        super(message);
    }

    public NotAccessException() {
    }

    public NotAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAccessException(Throwable cause) {
        super(cause);
    }

    public NotAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
