package ru.ainurforex.arraylist.exceptions;

public class NullItemException extends RuntimeException {
    public NullItemException() {
    }

    public NullItemException(String message) {
        super(message);
    }
}
