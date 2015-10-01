package com.qaworks.test.common;

public class ContactException extends RuntimeException {

	public ContactException(String message){
          super(message);
    }

    public ContactException(String message, Throwable throwable){
           super(message);
    }
}
