package com.example.demo.helloworld;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
    
        return String.format("HELLO WORLD BEAN [message=%s]",message);
    }
    
}
