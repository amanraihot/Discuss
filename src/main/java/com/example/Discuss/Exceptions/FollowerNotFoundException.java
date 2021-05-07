package com.example.Discuss.Exceptions;

public class FollowerNotFoundException extends RuntimeException{

    public FollowerNotFoundException(String message,Exception exception)
    {
        super(message);
    }

    public FollowerNotFoundException(String exmessage)
    {
        super(exmessage);
    }
}
