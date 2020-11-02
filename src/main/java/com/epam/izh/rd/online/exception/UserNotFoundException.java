package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends RuntimeException {

  public UserNotFoundException(String message) {
    super(message);
  }
}
