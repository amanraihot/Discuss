package com.example.Discuss.Exceptions;

public class SpringDiscussException extends  RuntimeException{
    public SpringDiscussException(String message,Exception exception)
    {
        super(message);
    }
    public SpringDiscussException(String exMessage)
    {
        super(exMessage);
    }
}
