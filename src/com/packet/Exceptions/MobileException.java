package com.packet.Exceptions;

/**
 * Created by Mihai on 10/29/2014.
 * Exception class used for prompting a specific message
 * when an exception is thrown
 * The specific messages are declared in the "Constants" class
 */
public class MobileException extends Exception {

    /**
     * Prints a specific message when a MobileException is thrown.
     *
     * @param message the string message which gives information about
     *                the event which triggered the Exception;
     */
    public MobileException(String message) {
        super(message);
    }
}
