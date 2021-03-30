package com.hdgd.exception;

import org.springframework.security.core.AuthenticationException;


public class NotLoginException extends AuthenticationException {

    public NotLoginException(String msg, Throwable t) {
        super(msg, t);
    }

    public NotLoginException(String msg) {
        super(msg);
    }
}
