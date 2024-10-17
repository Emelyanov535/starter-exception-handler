package ru.mediasoft.demostarterexceptionhandler.exception;

public class NotExpectedCustomerException extends RuntimeException {
    public NotExpectedCustomerException() {
        super("Not expected customer");
    }
}
