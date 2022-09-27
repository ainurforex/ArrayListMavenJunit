package ru.ainurforex.arraylist.exceptions;

public class ArraySizeIsFullException extends RuntimeException {
    public ArraySizeIsFullException() {
    }

    public ArraySizeIsFullException(String message) {
        super(message);
    }
}
