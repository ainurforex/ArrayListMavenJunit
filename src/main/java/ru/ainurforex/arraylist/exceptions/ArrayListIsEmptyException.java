package ru.ainurforex.arraylist.exceptions;

public class ArrayListIsEmptyException extends RuntimeException{
    public ArrayListIsEmptyException() {
    }

    public ArrayListIsEmptyException(String message) {
        super(message);
    }
}
